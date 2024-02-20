package ch19.sec03.exam02;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatServer {
	// 서버포트 상수
	public static final int PORT = 9999;

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		// 배열 기반 리스트(크기 동적으로 변경 가능),
		//Collections.synchronizedList -> 리스트에 접근하는 모든 메서드 호출을 동기화하여 여러 스레드가 동시에 해당 리스트에 접근하는 것을 막는다.
		//List<타입>변수명 = new ArrayList<타입>();
		List<ChatServerThread> userList = Collections.synchronizedList(new ArrayList<>());
		try {
			serverSocket = new ServerSocket();
			// 0.0.0.0은 서버소켓을 모든 사용 가능한 네트워크 인터페이스에서 서버가 수신대기
			serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT));
			System.out.println("[SERVER] start [port : " + PORT + "]");

			while (true) {
				Socket socket = serverSocket.accept();
				new ChatServerThread(socket, userList).start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}