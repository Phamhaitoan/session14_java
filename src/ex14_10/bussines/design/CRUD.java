package ex14_10.bussines.design;

public interface CRUD {
    void displayAll(); //Hiển thị thông tin của tất cả các phần tử

    void displayInfo();//Hiển thị thông tin của từng phần tử

    void addElement();//Thêm phần tử mới

    void editInfo();//Chỉnh sửa thông tin phần tử

    void displayInfoById();//Tìm kiếm và hiển thị phần tử

    void deleteElement();//Xóa phần tử

    int searchById(String id);
}
