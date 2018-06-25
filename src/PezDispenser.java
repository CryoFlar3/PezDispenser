class PezDispenser {
    final private String mCharacterName;
    public final static int MAX_PEZ = 12;
    private int pezCount;

    public PezDispenser(String characterName){
        mCharacterName = characterName;
        pezCount = 0;
    }

    // fill() is an Overloaded Method
    public void fill() {
        fill(MAX_PEZ);
    }

    public void fill(int pezAmount){
        int newAmount = pezCount + pezAmount;
        if (newAmount > MAX_PEZ){
            throw new IllegalArgumentException("Too Many PEZ!!!!");
        }
        pezCount = newAmount;
    }

    public boolean isEmpty(){
        return pezCount == 0;
    }

    public boolean dispense(){
        boolean wasDispensed = false;
        if (!isEmpty()){
            pezCount--;
            wasDispensed = true;
        }
        return wasDispensed;
    }

    public String getCharacterName(){
        return mCharacterName;
    }


}
