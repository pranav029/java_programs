import com.google.gson.*;
import java.io.IOException;
import java.net.URI;
import java.net.http.*;
import java.util.Scanner;
import java.lang.*;

public class covid {
    public static void main(String args[]) throws IOException, InterruptedException
    {
        Scanner sc=new Scanner(System.in);
        String url="https://api.apify.com/v2/key-value-stores/toDWvRj1JpTXiM8FF/records/LATEST?disableRedirect=true";
        HttpRequest rq=HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
        HttpClient cl=HttpClient.newBuilder().build();
        var rp=cl.send(rq,HttpResponse.BodyHandlers.ofString());
        String cases=rp.body();
        // Gson g = new Gson();  
        JsonObject con = new Gson().fromJson(cases, JsonObject.class);
        JsonArray arr= con.get("regionData").getAsJsonArray();
        //  System.out.println("Enter state name");
        //  String in=sc.nextLine();
        System.out.println("Active Corona cases:-");
        for(int i=0;i<arr.size();i++){
            String a=arr.get(i).getAsJsonObject().get("region").getAsString();
            // if(!in.equals(a))continue;
            String b=arr.get(i).getAsJsonObject().get("activeCases").getAsString();
            System.out.println(a+" "+b);
        }
        
        // System.out.println("Total recovered cases: "+con.get("recovered").getAsString());
        
    }   
}

