package Models;

import java.util.ArrayList;

public class Response {

        private float resultCount;
        ArrayList<Object> results = new ArrayList<Object>();


    public ArrayList<Object> getResults() {
        return results;
    }

    public void setResults(ArrayList<Object> results) {
        this.results = results;
    }

    public float getResultCount() {
            return resultCount;
        }

        public void setResultCount( float resultCount ) {
            this.resultCount = resultCount;
        }

}
