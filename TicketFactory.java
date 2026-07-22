public class TicketFactory {
    public static Ticket createTicket(String type){
        if(type.equalsIgnoreCase("regular")){
            return new RegularTicket();
        }

        if(type.equalsIgnoreCase("premium")){
            return new PremiumTicket();
        }

        if(type.equalsIgnoreCase("recliner")){
            return new ReclinerTicket();
        }

        return null;
    }
}
