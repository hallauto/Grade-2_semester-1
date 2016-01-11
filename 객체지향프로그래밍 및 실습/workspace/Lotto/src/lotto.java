import javax.swing.JOptionPane;
public class lotto {
	public static void main(String argc[]){
		made_lotto made =new made_lotto(); 
		String insult_number=JOptionPane.showInputDialog("숫자를 입력하세요");
		if (insult_number==null)
		{
			JOptionPane.showMessageDialog(null,"종료");
			System.exit(0);
		}
		int selected_number=Integer.parseInt(insult_number);
		String print=made.make_lotto_number(selected_number);
		int retry=0;
		while (retry<1)
		{
			JOptionPane.showMessageDialog(null, print);
			retry=1;
			retry=JOptionPane.showConfirmDialog(null, "숫자를 다시 뽑겠습니까?"
				,"선택 화면",JOptionPane.YES_NO_OPTION);
			{
				print=made.make_lotto_number(selected_number);
			}
		}
	}
}
class made_lotto {
	public String make_lotto_number(int selected_number){
		String print="";
		if (selected_number<1)
		{
			JOptionPane.showMessageDialog(null, "1 이상의 정수를 넣으세요"
					,"숫자오류",JOptionPane.ERROR_MESSAGE);
		}
		else {
		for (int i=0;i<selected_number;i++)
		{
			print=print+Integer.toString((int)(Math.random()*100%45+1))+"\n";
			System.out.println(print);
		}
		}
		return print;
	}
	made_lotto(){};
}