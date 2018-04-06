package instatag.com.b3ds;

/**
 * Created by RahulReign on 03-04-2018.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum_FetchingMsg {

    @SerializedName("Communication")
    @Expose
    private Communication communication;

    public Communication getCommunication() {
        return communication;
    }

    public void setCommunication(Communication communication) {
        this.communication = communication;
    }

}