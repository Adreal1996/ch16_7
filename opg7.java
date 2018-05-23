package ch16;

/*
Write a method called deleteBack that deletes the last value (the value at the back of the list)
and returns the deleted value. If the list is empty, throw a NoSuchElementException.
 */

public class opg7
{
    public static void main(String[] args)
    {
        LinkedIntList liste = new LinkedIntList();
        liste.add(1);
        liste.add(18);
        liste.add(2);
        liste.add(7);
        liste.add(18);
        liste.add(39);
        liste.add(18);
        liste.add(40);
        System.out.println("tallet, som er blevet fjernet er.... bdmmm tsh: " + liste.deleteBack());
    }

}
