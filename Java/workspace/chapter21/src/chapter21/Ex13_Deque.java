package chapter21;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Ex13_Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Stack 클래스는 옛날 방식으로 현재는 권장하지 않음
//		Deque보다 처리가 느림, Vector 기반의 자료규조 스레드 실행시 안전
		Stack<String> stack = new Stack<>();
//		위의 Stack대신 사용하도록 권장되는 클래스
//		Stack 보자 빠르다. list기반의 자료구조를 사용하고 스레드실행시 안전하지않음.
//		queue의 특징과 Stack의 특징 둘다 사용가능	
		Deque<String> deq = new ArrayDeque<>();
//		offerFirst : 첫번째에 데이터를 추가
		deq.offerFirst("A");
		deq.offerFirst("B");
		deq.offerFirst("C");
//		pollFirst() : 첫번재 데이터 출력후 삭제
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		
		deq.offerLast("A");
		deq.offerLast("B");
		deq.offerLast("C");
//		pollFirst() : 첫번재 데이터 출력후 삭제
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		
//		queue를 deque로 구현
		deq.offerLast("A");
		deq.offerLast("B");
		deq.offerLast("C");
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
	}

}
