public class Enigma{

    private String rotorInit[] = {"#GNUAHOVBIPWCJQXDKRYELSZFMT",
        "#EJOTYCHMRWAFKPUZDINSXBGLQV",
        "#BDFHJLNPRTVXZACEGIKMOQSUWY",
        "#NWDKHGXZVRIFJBLMAOPSCYUTQE",
        "#TGOWHLIFMCSZYRVXQABUPEJKND"};


    private Rotor rotors[];
        
    public Enigma(int id1, int id2, int id3, String start){

        rotors = new Rotor[3];
        rotors[0] = new Rotor(rotorInit[id1-1], start.charAt(0));
        rotors[1] = new Rotor(rotorInit[id2-1], start.charAt(1));
        rotors[2] = new Rotor(rotorInit[id3-1], start.charAt(2));
        
    }


    public String decrypt(String message){        
        String str = "";
        for (int j = 0; j < message.length(); j++){
            int i = rotors[2].indexOf(message.charAt(j));
            char ch = rotors[1].charAt(i);
            i = rotors[2].indexOf(ch);
            ch = rotors[0].charAt(i);
            str += ch;
            rotate();
        }

        return str;
    }


    
    public String encrypt(String message){
        String str = "";
        for (int j = 0; j < message.length(); j++){
            int i = rotors[0].indexOf(message.charAt(j));
            char ch = rotors[2].charAt(i);
            i = rotors[1].indexOf(ch);
            ch = rotors[2].charAt(i);
            str += ch;
            rotate();
        }
        return str;
    }

    
    private void rotate(){
        if(rotors[0].rotate()){
            if(rotors[1].rotate()){
                rotors[2].rotate();
            }
        }
    }
    
}
