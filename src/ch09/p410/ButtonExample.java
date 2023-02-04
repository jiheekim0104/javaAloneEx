package ch09.p410;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOK = new Button();
		
		class OkListener implements Button.ClickListener{
			
			@Override
			public void onClick() {
				System.out.println("OK ��ư�� Ŭ���߽��ϴ�.");
			}
		} 

		btnOK.setClickListener(new OkListener());
		btnOK.click();
		
		
		Button btnCancle = new Button();
		class CancleListener implements Button.ClickListener{
			
			@Override
			public void onClick(){
				System.out.println("CANCLE ��ư�� Ŭ���߽��ϴ�.");
			}
		}
		
		btnCancle.setClickListener(new CancleListener());
		btnCancle.click();
		
	}

}
