class Bank{
    private String anumber;
    private double totalb;
    public Bank(String anumber,double totalb){
        this.anumber=anumber;
        this.totalb=totalb;
    }
    public String getanumber(){
        return anumber;
    }
    public double gettotalb(){
        return totalb;
    }
    public void deposit(double amt){
        if(amt>0){
            totalb +=amt;
            System.out.println("Deposit:Rs "+amt);
        }
        else{
            System.out.println("error");
        }
    }
    public void withdraw(double amt){
        if(amt>0 && amt <= totalb){
            totalb-=amt;
            System.out.println("withdraw:Rs "+amt);
        }
        else{
            System.out.println("error");
        }
    }
}
class BankApp{
    public static void main(String[] args) {
        Bank acc=new Bank("78787087",3000);
        System.out.println("Account no: "+acc.getanumber());
        System.out.println("Initial Balance: "+acc.gettotalb());
        acc.deposit(100);
        System.out.println("Balance after deposit"+acc.gettotalb());
        acc.withdraw(300);
        System.out.println("Balance after Withdrawal"+acc.gettotalb());
    }
}