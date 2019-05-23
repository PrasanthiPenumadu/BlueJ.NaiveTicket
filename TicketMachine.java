/**
 * TicketMachine models a naive ticket machine that issues
 * flat-fare tickets.
 * The price of a ticket is specified via the constructor.
 * It is a naive machine in the sense that it trusts its users
 * to insert enough money before trying to print a ticket.
 * It also assumes that users enter sensible amounts.
 *Users have an option of two tickets to buy at different prices*/
  class TicketMachine
{
    // The price of a ticket from this machine.
    private int price;
    // The amount of money entered by a customer so far.
    private int balance;
    // The total amount of money collected by this machine.
    private int price2;

    
    public TicketMachine(int ticketPrice1,int ticketPrice2 )
    {
        price = ticketPrice1;
        price2=ticketPrice2;
        balance = 0;
        
    }
    

    
    public int getPrice()
    {
        return price;
    }
    public int getPrice2()
    {
        return price2;
    }

    
    public int getBalance()
    {
        return balance;
    }
   

    
    public void insertMoney(int amount)
    {
        if(amount>0)
        balance = balance + amount;
        else
        System.out.println("Invalid amount");
    }
   

    public void printTicket()
    {   
        if(balance>=price){
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price + " cents.");
        System.out.println("##################");
        System.out.println();
        balance =balance-price;
    }
    else{
     System.out.println("You still need to pay "+(price-balance));
    }
    
    }
     public void printTicket2(){
      
    if(balance>=price2){
        // Simulate the printing of a ticket.
        System.out.println("##################");
        System.out.println("# The BlueJ Line");
        System.out.println("# Ticket");
        System.out.println("# " + price2 + " cents.");
        System.out.println("##################");
        System.out.println();
        balance =balance-price2;
    }else{
     System.out.println("You still need to pay "+(price2-balance));  
        }
        
    }
}
