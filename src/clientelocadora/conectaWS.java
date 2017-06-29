package clientelocadora;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.HttpURLConnection;
import javax.net.ssl.HttpsURLConnection;
import java.util.ArrayList;
import java.util.List;
import model.domain.acervo.Item;
import model.domain.cliente.Cliente;
import model.domain.cliente.Locacao;

public class conectaWS {
    	private final String USER_AGENT = "Mozilla/5.0";
 
        public static void listarLocacoes() throws Exception{
            //conectaServicos http = new conectaServicos();
            conectaWS http = new conectaWS();
            String chamadaWS;
            chamadaWS = "http://localhost:8080/dw_locadorapaulo/resources/locacoes/getLocacoes";
            String json = http.sendGet(chamadaWS, "GET");
            Gson g = new Gson();
            
            //Locacao l = new Locacao();
            List locacoes = new ArrayList();
            Type locacaoType = new TypeToken<List<Locacao>>() {}.getType();
            locacoes = g.fromJson(json, locacaoType);
 
            for(int i = 0; i < locacoes.size();i++){
                Locacao l1 = (Locacao) locacoes.get(i);
                System.out.println("Data da Locacao : " + l1.getDtLocacao());
            }
        }
        
        public static void inserirLocacao(Locacao l) throws Exception{
            //conectaServicos http = new conectaServicos();
            conectaWS http = new conectaWS();
            String chamadaWS;
            chamadaWS = "http://localhost:8080/dw_locadorapaulo/resources/locacoes/efetuarLocacao";
            Gson g = new Gson();
            
            Type locacaoType = new TypeToken<Locacao>() {}.getType();
            
            String json = g.toJson(l, locacaoType);           
            http.sendPost(chamadaWS, json, "POST");              
                
        }
        
        public static List getItens() throws Exception{
            //conectaServicos http = new conectaServicos();
            conectaWS http = new conectaWS();
            String chamadaWS;
            chamadaWS = "http://localhost:8080/dw_locadorapaulo/resources/locacoes/getItens";
            String json = http.sendGet(chamadaWS, "GET");
            Gson g = new Gson();
            
            List itens = new ArrayList();
            Type itemType = new TypeToken<List<Item>>() {}.getType();
            itens = g.fromJson(json, itemType);
            
            return itens;
        }
        
        public static List getClientes() throws Exception{
            //conectaServicos http = new conectaServicos();
            conectaWS http = new conectaWS();
            String chamadaWS;
            chamadaWS = "http://localhost:8080/dw_locadorapaulo/resources/locacoes/getClientes";
            String json = http.sendGet(chamadaWS, "GET");
            Gson g = new Gson();
            
            List clientes = new ArrayList();
            Type itemType = new TypeToken<List<Cliente>>() {}.getType();
            clientes = g.fromJson(json, itemType); 

            return clientes;
        }        
 
	// HTTP GET request
	// HTTP GET request
	String sendGet(String url, String method) throws Exception {
 
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		// optional default is GET
		con.setRequestMethod(method);
 
		//add request header
		con.setRequestProperty("User-Agent", USER_AGENT);
 
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		//print result
		return response.toString();
 
	}
 
	// HTTP POST request
	void sendPost(String url, String urlParameters, String method) throws Exception {
 
		URL obj = new URL(url);
                //URL obj = new URL(null, url, new sun.net.www.protocol.https.Handler());
		//HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();
                HttpURLConnection con = (HttpURLConnection) obj.openConnection();
                 
		//add reuqest header
		con.setRequestMethod(method);
                con.setRequestProperty("Content-Type", "application/json");
		con.setRequestProperty("User-Agent", USER_AGENT);
		con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");
 
		//String urlParameters = "sn=C02G8416DRJM&cn=&locale=&caller=&num=12345";
 
		// Send post request
		con.setDoOutput(true);
		DataOutputStream wr = new DataOutputStream(con.getOutputStream());
		wr.writeBytes(urlParameters);
		wr.flush();
		wr.close();
 
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'POST' request to URL : " + url);
		System.out.println("Post parameters : " + urlParameters);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
 
		//print result
		System.out.println(response.toString());
 
	}
}
