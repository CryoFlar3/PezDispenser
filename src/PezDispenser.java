class PezDispenser {
    final private String mCharacterName;
    public final static int MAX_PEZ = 12;
    private int pezCount;

    public PezDispenser(String characterName){
        mCharacterName = characterName;
        pezCount = 0;
    }

    public void fill() {
        pezCount = MAX_PEZ;
    }

    public String getCharacterName(){
        return mCharacterName;
    }

    public String swapHead(String characterName){
        String originalCharacterName = characterName;
        return originalCharacterName;
    }
}
