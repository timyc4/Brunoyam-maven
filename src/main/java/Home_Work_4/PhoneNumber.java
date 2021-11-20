package Home_Work_4;



public class PhoneNumber {
    long num;
    String numType;

    PhoneNumber(){
        numType = "";
    }

    PhoneNumber(String a, long b){
        numType = a;
        num = b;
    }

    void print() {
        System.out.printf("Телефонный %s номер: %d\n", numType, num);
    }
    void changeType(String ct){
        numType = ct;
    }
    long getNum(){
        return num;
    }
}
