public interface Printable {
     String toStringShort();  // returns a string with just the id
     String toStringLong();   // returns a string with all details, don't call toStringLong inside itself (infinite loop)
}
