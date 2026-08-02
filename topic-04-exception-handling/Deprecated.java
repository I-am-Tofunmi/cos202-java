class Deprecated {
    /**
     * @deprected
     * This method is deprecated and has been replaced by newMethod()
     */
    @Deprecated
    public static void deprecatedMethod() {
        System.out.println("Deprecated method");
    }

    public static void main(String[] args) {
        deprecatedMethod();
    }
}