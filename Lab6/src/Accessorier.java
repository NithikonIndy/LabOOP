public class Accessorier {


    public static class Ring extends Accessorier { // accessorier
        private boolean Ring;

        /** Wear Ring .
         * effect : print "Now you can become invisible."
         * @param : none
         * @return : none
         * */
        public Ring() {
            System.out.println("Now you can become invisible.");
            Ring = true;
        }


        /** turn on ability invisible.
         * effect : if invisible is working ,print "invisible mode is working"
         * effect : print "invisible turn on."
         * @param : none
         * @return : none
         * */
        public void turnoninvisiblemode() {
            if (Ring == true) {
                System.out.println("invisible mode is working.");
            } else {
                System.out.println("invisible turn on.");
                Ring = true;
            }
        }

        /** turn off ability invisible.
         * effect : if invisible is n'tworking ,print "visible mode is working."
         * effect : print "invisible turn off."
         * @param :
         * @return :
         * */
        public void turnoffinvisiblemode() {
            if (Ring == false) {
                System.out.println("visible mode is working.");
            } else {
                System.out.println("invisible turn off.");
                Ring = false;
            }
        }
    }

    public static class Boots extends Accessorier { // accessorier
        private boolean Boots;

        /** Wear Boots.
         * effect : print "Now you can become invisible."
         * @param : none
         * @return : none
         * */
        public Boots() {
            System.out.println("Now you can become invisible.");
            Boots = true;
        }
        /** turn on ability walk on water.
         * effect : if walk on water is wroking , print "walk on water  mode is working."
         * effect : print "walk on water mode trun on."
         * @param : none
         * @return : none
         * */

        public void turnonwalkonwatermode() {
            if (Boots == true) {
                System.out.println("walk on water mode is working.");
            } else {
                System.out.println("walk on water mode trun on.");
                Boots = true;
            }
        }

        /** turn off ability walk on water.
         * effect :if walk on water  is not working , print "walk on water mode is already closed."
         * effect : print "walk on water mode trun off."
         * @param : none
         * @return : none
         * */
        public void turnoffwalkoffwatermode() {
            if (Boots == false) {
                System.out.println("walk on water mode is already closed.");
            } else {
                System.out.println("walk on water mode trun off.");
                Boots = false;
            }
        }
    }
}

