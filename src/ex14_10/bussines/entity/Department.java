package ex14_10.bussines.entity;

import ex14_10.bussines.IManager.DepartmentImplement;
import ex14_10.bussines.config.InputMethods;

import java.util.Scanner;

public class Department {
    private String departmentID;
    private String departmentName;
    private int totalMembers;

    public Department() {
    }

    public Department(String departmentID, String departmentName, int totalMembers) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.totalMembers = totalMembers;
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentID='" + departmentID + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", totalMembers=" + totalMembers +
                '}';
    }
    public void displayData (){
        System.out.println( "Department{" +
                "departmentID='" + departmentID + '\'' +
                ", departmentName='" + departmentName + '\'' +
                ", totalMembers=" + totalMembers +
                '}');
    }
    public void inputData(){
        while (true)
        {
            System.out.println("Mời nhập mã phòng ban, bắt đầu bằng D và có 4 ký tự");
            String input = InputMethods.getString();
            if (!input.startsWith("D") || input.length() != 4)
            {
                System.out.println("Vui lòng nhập đúng định dạng");
                break;
            } else this.departmentID = input;
        }
        outer:
        while (true)
        {
            System.out.println("Mời nhập tên phòng ban");
            this.departmentName = InputMethods.getString();
            for (int i = 0; i < DepartmentImplement.departmentList.size(); i++)
            {
                if (departmentName.equals(DepartmentImplement.departmentList.get(i).departmentName))
                {
                    System.out.println("Tên này đã tồn tại, vui lòng nhập tên khác");
                } else break outer;
            }
        }
    }
}
