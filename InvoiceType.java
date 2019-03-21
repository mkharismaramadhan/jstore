
/**
 * Enumeration class InvoiceType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum InvoiceType
{
    Buy {
        public String toString() {
            return "Buy";
        }
    },
    
    Sell {
        public String toString() {
            return "Sell";
        }
    },
    
}
