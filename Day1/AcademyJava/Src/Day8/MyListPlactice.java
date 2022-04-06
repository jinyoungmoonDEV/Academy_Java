package Day8;
import java.util.Scanner;

class MyList {
	class Node{
		int item;
		Node llink;
		Node rlink;
		public  Node(int item) {
			this.item = item;
		}
	}
	public   Node add(Node p,int num){
		if(p==null) {
			p = new Node(num);
			p.item = num;
			p.link = null;

		}
		else {
			p.link = add(p.link, num);
		}
		return p;
	}
	public  Node delete(Node p) {
		if(p==null) {
			System.out.printf("입력한 값이 없습니다.");
			return p;
		}
		else {
			return p.link;
		}
	}
	public  void print(Node p) {
		while(p != null) {
			System.out.println(p.item);
			p = p.link;
		}
	}
}
public class MyListPlactice {

	public static void main(String[] args) {
		int cond,item;
		Scanner scanner = new Scanner(System.in);
		MyList.Node root = null;
		MyList list = new MyList();
		while(true) {
			System.out.println("1.삽입 2.삭제 3.출력 4.종료");
			cond = scanner.nextInt();
			if(cond ==1) {
				System.out.printf("입력하세요 :");
				item = scanner.nextInt();
				root = list.add(root,item);
			}
			else if(cond == 2) {
				root = list.delete(root);
			}
			else if (cond == 3) {
				list.print(root);
			}
			else if(cond == 4) {
				System.out.print("수고하셨습니다.");
				break;
			}
			else {
				System.out.print("다시입력하세요\n");
			}
		}
	}
}
