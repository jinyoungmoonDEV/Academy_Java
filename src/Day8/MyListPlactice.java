package Day8;
import java.util.Scanner;

class MyList {//문진영 코드입니다!
	static class Node{//static 사용함으로써 다형성 구현
		int item;
		Object a = null;
		Node llink;//왼쪽자식
		Node rlink;//오른쪽자식
		public Node(int item) {//Node 클래스 생성자
			this.item = item;
		}
		public Node(Object a) {//다형성을 활용하여 null을 위한 Node메서드 활용
			this.a = a;
		}
	}
	public Node add(Node head,int num){//입력
		MyList.Node node;
		MyList.Node newnode= new MyList.Node(null);//다형성을 활용하여 null을 위한 Node메서드 활용
		newnode.item = num;//newnode에 받은num 값을 지정 0 출력 방지
		if(head==null) {//값이 없을경우
			head = new Node(num);//새로운 지정
			head.item = num;
			head.llink = null;
			head.rlink = null;
		}
		else {//값있을경우
			node = head.llink;//삽입 위치
			newnode.llink = node;//시작 = 끝
			newnode.rlink = node.rlink;//자기자신 지정
			node.rlink.llink = newnode;
			node.rlink = newnode;
		}
		return head;
	}
	public Node delete(Node head) {//삭제
		MyList.Node deleted;//deleted object 생성
		if(head==null) {//입력값이 없을떄
			System.out.printf("입력한 값이 없습니다.");
			return head;
		}
		else if((head == head.llink) && (head == head.rlink)){//왼쪽자식 유,무 and연산자로 확인
			System.out.print("Queue Empty\n");
		}
		else {
			deleted = head.rlink;//queue구조로 오른쪽자식부터 삭제
			deleted.llink.rlink = deleted.rlink;
			deleted.rlink.llink = deleted.llink;
			return head;//deleted결과 리턴
		}
		return head;//임의 리턴
	}
	public  void print(Node head) {//출력
		MyList.Node ptr;
		ptr = head.rlink;
		while(ptr != head) {
			System.out.println(ptr.item);
			ptr = ptr.rlink;//queue구조로 rlist먼저 출력
		}
	}
}
public class MyListPlactice {

	public static void main(String[] args) {
		int cond,item;
		Scanner scanner = new Scanner(System.in);
		MyList.Node head;//head object생성
		head = new MyList.Node(null);//다형성을 활용하여 null을 위한 Node메서드 활용
		head.llink = head.rlink = head;//초기화
		MyList list = new MyList();
		while(true) {
			System.out.println("1.삽입 2.삭제 3.출력 4.종료");
			cond = scanner.nextInt();
			if(cond ==1) {//삽입선택 -> add()
				System.out.printf("입력하세요 :");
				item = scanner.nextInt();
				head = list.add(head,item);
			}
			else if(cond == 2) {//삭제선택 -> delete()
				head = list.delete(head);
			}
			else if (cond == 3) {//출력선택 -> print()
				list.print(head);
			}
			else if(cond == 4) {//수고하셨습니다!
				System.out.print("수고하셨습니다.");
				break;
			}
			else {
				System.out.print("다시입력하세요.\n");
			}
		}
	}
}
