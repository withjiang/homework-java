import java.util.Date;
   public class Account{

public static void main(String[] args){
    Account account = new Account(1,20000);
   account.setannualInterestRate (4.5);
 account.Withdrawl(2000);
  account.Deposit(2000);
   
  System.out.println("blance:" + account.getbalance() + "\n interest:"+account.getMonthlyInterest()+"\ndate" +account.getdateCreated() );
  
}
    private int id=0;
    private double balance=0;
   private double annualInterestRate = 0;
    private Date dateCreated;
   public Account(){
    this.dateCreated = new Date(); 
}//����Ĭ���˻����޲ι��췽�� 
  public Account(int id, double balance){
//����ָ��id���ʼ����˻��Ĺ��췽��
   this.id = id;
   this. balance = balance;    
   this.dateCreated = new Date(); 
   }
//�������Լ��޸���
    public int getid(){
      return id;
   }
   public void setid(int newid){
     this.id = newid;
   }
   public double getbalance(){
      return balance;
   }
   public void setbalance(double newbalance){
     this.balance = newbalance;
   }
public double getannualInterestRate(){
      return annualInterestRate;
   }
   public void setannualInterestRate(double annualInterestRate){
     this.annualInterestRate = annualInterestRate;
   }
//dateCreated�ķ���������
 public Date getdateCreated(){
   return dateCreated;
}
  public double getMonthlyInterestRate(){
    double i = annualInterestRate/12;
     return i;
}
  public double getMonthlyInterest(){
    double i = balance *(annualInterestRate/12)/100;
  return i ;
    
   }

public void Withdrawl(double money){
  if(money > balance)
  balance = balance - money;
else
  System.out.println("you donnot have enough money");    
}
public void Deposit(double money){
  balance += money;
}





}