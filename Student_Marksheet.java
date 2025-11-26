import java.util.Scanner;
class main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        String Reg_No, Full_Name;
        int IGS_2202, CCS_2207, CCS_2208, CCS_2209,CCS_2210,CCS_2211,SMA_2215;

        System.out.println("Enter the First Student's Registration No: ");
        Reg_No = input.nextLine();
        System.out.println("Enter the First Student's Full Name: ");
        Full_Name = input.nextLine();
        System.out.println("Enter the First Student's IGS_2202 mark ");
        IGS_2202 = input.nextInt();
        System.out.println("Enter the First Student's CCS_2207 mark: ");
        CCS_2207 = input.nextInt();
        System.out.println("Enter the First Student's CCS_2208 mark: ");
        CCS_2208= input.nextInt();
        System.out.println("Enter the First Student's CCS_2209 mark: ");
        CCS_2209= input.nextInt();
        System.out.println("Enter the First Student's CCS_2210 mark: ");
        CCS_2210 = input.nextInt();
        System.out.println("Enter the First Student's CCS_2211 mark: ");
        CCS_2211 = input.nextInt();
        System.out.println("Enter the First Student's SMA_2215 mark: ");
        SMA_2215 = input.nextInt();
        int Total_marks = IGS_2202+CCS_2207+CCS_2208+CCS_2209+CCS_2210+CCS_2211+SMA_2215;
        int Avrg =(Total_marks/7);

        //The Second students input details.
        Scanner Sn = new Scanner(System.in);
        String RegNo,FullName;
        int  IGS2202, CCS2207, CCS2208, CCS2209, CCS2210, CCS2211, SMA2215;
        System.out.println("Enter Second student's RegNo: ");
        RegNo = Sn.nextLine();
        System.out.println("Enter Second student's FullName: ");
        FullName = Sn.nextLine();
        System.out.println("Enter Second student's IGS2202 mark: ");
        IGS2202 = Sn.nextInt();
        System.out.println("Enter Second student's CCS2207 mark: ");
        CCS2207 = Sn.nextInt();
        System.out.println("Enter Second student's CCS2208 mark: ");
        CCS2208 = Sn.nextInt();
        System.out.println("Enter Second student's CCS2209 mark: ");
        CCS2209 = Sn.nextInt();
        System.out.println("Enter Second student's CCS2210 mark: ");
        CCS2210 = Sn.nextInt();
        System.out.println("Enter Second student's CCS2211 mark: ");
        CCS2211 = Sn.nextInt();
        System.out.println("Enter Second student's SMA2215 mark: ");
        SMA2215 = Sn.nextInt();
        int TotalMarks =IGS2202+CCS2207+CCS2208+CCS2209+CCS2210+CCS2211+SMA2215;
        int avrg  =(TotalMarks/7);

        String RegNumber, Name;
        int Unit1,Unit2,Unit3,Unit4,Unit5,Unit6,Unit7;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter 3rd Student's RegNumber: ");
        RegNumber = Input.nextLine();
        System.out.println("Enter 3rd Student's Name: ");
        Name = Input.nextLine();
        System.out.println("Enter 3rd Student's IGS 2202 mark: ");
        Unit1 = Input.nextInt();
        System.out.println("Enter 3rd Student's IGS 2207 mark: ");
        Unit2 = Input.nextInt();
        System.out.println("Enter 3rd Student's CCS 2208 mark: ");
        Unit3 = Input.nextInt();
        System.out.println("Enter 3rd Student's CCS 2209 mark: ");
        Unit4 = Input.nextInt();
        System.out.println("Enter 3rd Student's CCS 2210 mark: ");
        Unit5 = Input.nextInt();
        System.out.println("Enter 3rd Student's CCS 2211 mark: ");
        Unit6 = Input.nextInt();
        System.out.println("Enter 3rd Student's SMA 2215 mark: ");
        Unit7 = Input.nextInt();
        int totalMarks =(Unit1+Unit2+Unit3+Unit4+Unit5+Unit6+Unit7);
        int AvrgMark = (totalMarks/7);


        Scanner Snn = new Scanner(System.in);
        String Reg_Number, Na_me;
        int unit_1, unit_2, unit_3, unit_4, unit_5, unit_6, unit_7;

        System.out.print("Enter the fourth Student's Registration Number: ");
        Reg_Number = Snn.nextLine();
        System.out.print("Enter the fourth Student's Full Name: ");
        Na_me = Snn.nextLine();
        System.out.print("Enter the fourth Student's IGS 2202 Marks: ");
        unit_1 = Snn.nextInt();
        System.out.print("Enter the fourth Student's CCS 2207 Marks: ");
        unit_2 = Snn.nextInt();
        System.out.print("Enter the fourth Student's CCS 2208 Marks: ");
        unit_3 = Snn.nextInt();
        System.out.print("Enter the fourth Student's CCS 2209 Marks: ");
        unit_4 = Snn.nextInt();
        System.out.print("Enter the fourth Student's CCS 2210 Marks: ");
        unit_5 = Snn.nextInt();
        System.out.print("Enter the fourth Student's CCS 2211 Marks: ");
        unit_6 = Snn.nextInt();
        System.out.print("Enter the fourth Student's SMA 2215 Marks: ");
        unit_7 = Snn.nextInt();

        int Total = unit_1+unit_2+unit_3+unit_4+unit_5+unit_6+unit_7;
        int Average = (unit_1+unit_2+unit_3+unit_4+unit_5+unit_6+unit_7)/7;

        Scanner INPUT = new Scanner(System.in);
        String RegistrationNo, StudentName;
        int UNIT_1, UNIT_2, UNIT_3, UNIT_4, UNIT_5, UNIT_6, UNIT_7;
        System.out.print("Enter the fifth Student Registration Number: ");
        RegistrationNo = INPUT.nextLine();
        System.out.print("Enter the fifth Student Name: ");
        StudentName = INPUT.nextLine();
        System.out.print("Enter the fifth student's IGS 2202 Marks : ");
        UNIT_1 = INPUT.nextInt();
        System.out.print("Enter the fifth student's CCS 2207 Marks : ");
        UNIT_2 = INPUT.nextInt();
        System.out.print("Enter the fifth student's CCS 2208 Marks : ");
        UNIT_3 = INPUT.nextInt();
        System.out.print("Enter the fifth student's CCS 2209 Marks : ");
        UNIT_4 = INPUT.nextInt();
        System.out.print("Enter the fifth student's CCS 2210 Marks : ");
        UNIT_5 = INPUT.nextInt();
        System.out.print("Enter the fifth student's CCS 2211 Marks : ");
        UNIT_6 = INPUT.nextInt();
        System.out.print("Enter the fifth student's SMA 2215 Marks : ");
        UNIT_7 = INPUT.nextInt();



        int total = UNIT_1+UNIT_2+UNIT_3+UNIT_4+UNIT_5+UNIT_6+UNIT_7;
        int average = (total/7);

        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDedan Kimathi University of Technology");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSchool of Computer Science and IT");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Department of Computer Science");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAcademic Year: 2024/2025");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSTUDENT MARKSHEET (SECOND YEAR RESULTS)");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|\tReg No."+"\t\t\t|\tFull Name\t"+"\t|CCS 2211"+"\t|CCS 2210"+"\t|CCS 2209"+"\t|CCS 2208"+"\t|CCS 2207"+"\t|IGS 2202"+"\t|SMA 2215"+"\t|TOTALS"+"\t|AVERAGE"+"\t|STATUS"+"\t|GRADE\t|");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|"+Reg_No+"\t|"+Full_Name+" |\t"+CCS_2211+"\t\t|\t"+CCS_2210+"\t\t|\t"+CCS_2209+"\t\t|\t"+CCS_2208+"\t\t|\t"+CCS_2207+"\t\t|\t"+IGS_2202+"\t\t|\t"+SMA_2215+"\t\t|\t"+Total_marks+"\t|\t"+Avrg+"\t\t|"+"\t\t|\t\t|");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|"+RegNo+"\t|"+FullName+"\t\t |\t"+CCS2211+"\t\t|\t"+CCS2210+"\t\t|\t"+CCS2209+"\t\t|\t"+CCS2208+"\t\t|\t"+CCS2207+"\t\t|\t"+IGS2202+"\t\t|\t"+SMA2215+"\t\t|\t"+TotalMarks+"\t|\t"+avrg+"\t\t|"+"\t\t|\t\t|");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|"+RegNumber+"\t|"+Name+" \t\t|\t"+Unit6+"\t\t|\t"+Unit5+"\t\t|\t"+Unit4+"\t\t|\t"+Unit3+"\t\t|\t"+Unit2+"\t\t|\t"+Unit1+"\t\t|\t"+Unit7+"\t\t|\t"+totalMarks+"\t|\t"+AvrgMark+"\t\t|"+"\t\t|\t\t|");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|"+Reg_Number+"\t|"+Na_me+"\t |\t"+unit_6+"\t\t|\t"+unit_5+"\t\t|\t"+unit_4+"\t\t|\t"+unit_3+"\t\t|\t"+unit_2+"\t\t|\t"+unit_1+"\t\t|\t"+unit_7+"\t\t|\t"+Total+"\t|\t"+Average+"\t\t|"+"\t\t|\t\t|");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("|"+RegistrationNo+"\t|"+StudentName+"\t \t|\t"+UNIT_6+"\t\t|\t"+UNIT_5+"\t\t|\t"+UNIT_4+"\t\t|\t"+UNIT_3+"\t\t|\t"+UNIT_2+"\t\t|\t"+UNIT_1+"\t\t|\t"+UNIT_7+"\t\t|\t"+total+"\t|\t"+average+"\t\t|"+"\t\t|\t\t|");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}
