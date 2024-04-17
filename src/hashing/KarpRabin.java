package hashing;

public class KarpRabin {

    private final int PRIME = 101;

    private double hashing(String s){
        double hash = 0;
        for(int i =0; i<s.length(); i++){
            hash += s.charAt(i) * Math.pow(PRIME,i);
        }

        return hash;
    }

    private double updateHashing(double oldHash,char old,char newOne, int strLength){
        double newHash = (oldHash - old)/PRIME;
        newHash = newHash + newOne * Math.pow(PRIME,strLength-1);

        return newHash;

    }

    public int Search(String parent, String child){
        double childHash = hashing(child);
        int childLength  = child.length();
        double parentHash = hashing(parent.substring(0,childLength));

        for(int i = 0; i<=parent.length()-childLength; i++){
            if(parentHash == childHash){
                if(child.equals(parent.substring(i,i+childLength))){
                    return i;
                }
            }

            if(i<parent.length()-childLength){
                parentHash = updateHashing(parentHash,parent.charAt(i),parent.charAt(i+childLength),childLength);
            }
        }

        return -1;
    }
}
