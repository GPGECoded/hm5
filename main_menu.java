import java.util.*;

public class main_menu {
    public static void main(String[] args) {
        Scanner choice=new Scanner(System.in);
        System.out.println("1.Circle");
        System.out.println("2.Area");
        System.out.println("3.Exit");
        System.out.print("Plz Select: ");
        int select=choice.nextInt();

        switch (select) {
            case 1:
                System.out.print("ระบุรัสมีวงกลม: ");
                float data=choice.nextFloat();
                System.out.println("เส้นรอบวงคือ: "+(2*22/7*data));
                break;
        
            case 2:
                System.out.print("ระบุรัสมีของวงกลม: ");
                float data1=choice.nextFloat();
                System.out.println("พื้นที่วงกลมคือ: "+(22/7*data1*data1));
            default:
                break;
        }
    }
}
