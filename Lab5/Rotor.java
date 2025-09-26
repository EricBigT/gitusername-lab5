public class Rotor {

    
    private String rotorValues;
    private char startChar;
        
    public Rotor(String v, char c){
        this.rotorValues = new String(v);
        this.startChar = c;
        
        while(!this.rotate());
            
    }
    
    public boolean rotate(){
        //current first char = startChar
        char[] newInner = new char[v.length];
        newInner[0] = v[0];
        for (int i = 1; i < v.length - 1; i++){
            newInner[i] = v[i+1];
        }
        String str = new String(newInner);
        return true;
    }
    

    public int indexOf(char c){
        for (int i = 0; i < rotorValues.length; i++){
            
        }
    }

    public char charAt(int idx){
        //TODO
    }
}
    
