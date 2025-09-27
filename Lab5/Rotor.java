public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        char[] newInner = new char[rotorValues.length()]; //create new inner ring 
        newInner[0] = rotorValues.charAt(rotorValues.length()-1);
        for (int i = 1; i < rotorValues.length(); i++){ // set first value and shift all other values
            newInner[i] = rotorValues.charAt(i-1);
        }
        this.rotorValues = new String(newInner);
        
        if (newInner[0] == startChar){ //check new first element = old first element
            return true;
        }

        return false;
    }
    

    public int indexOf(char c){
        for (int i = 0; i < rotorValues.length(); i++){
            if (rotorValues.charAt(i) == c){ // iterate through the string to find the char
                return i; // return index
            }
        }
        return -1;
    }

    public char charAt(int idx){
        return rotorValues.charAt(idx); // return the char at the index
    }
}
    
