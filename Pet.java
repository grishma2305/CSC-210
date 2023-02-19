public abstract class Pet {
    String petType;
    boolean isTrainingRequired;
    boolean anyLegalRestrictions;

    public Pet() {
        anyLegalRestrictions = false;
    }

    public Pet(String petType) {
        this.petType = petType;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public boolean isTrainingRequired() {
        return isTrainingRequired;
    }

    public void setTrainingRequired(boolean trainingRequired) {
        isTrainingRequired = trainingRequired;
    }


    public String toString(){
        return "Pet of type: " + petType + " have any legal restrictions: " + anyLegalRestrictions + " is training required: " + isTrainingRequired;
    }

    public String ownerAttitude(){
        return "Owner cares about the pet.";
    }

}
