import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
/** 
 * @author Alvinho Rodrigues Ing das Neves (Help of CHAT GPT)
 * 
 * 
 * 
 *If you want to use Eleven Labs to transcribe text to audio and your text has more than 
 *one person and you want to use several different voices, you can use... this code.
 *
 * If u want you can use an file txt with all of ur texts and use a scanner to read it, but i prefer to use 
 * like this...make my cod bigger...
 */
public class TTSProject {

    // API key ElevenLabs
    static final String API_KEY = "Your  key of eleven labs";

    // Voice IDs
    static final String VOICE_INTERVIEWER = "TX3LPaxmHKxFdv7VOQHJ"; // male voice (narrator + interviewer)
    static final String VOICE_RESIDENT = "Xb7hH8MSUJpSbSDYk0k2";    // female voice

    public static void main(String[] args) {
        try {
            
            sintetizaESalvaAudio("At that time, with two children — one six years old,", VOICE_RESIDENT, 41);
            sintetizaESalvaAudio("the other just one — I slept on the ground in the neighborhood,", VOICE_RESIDENT, 42);
            sintetizaESalvaAudio("next to the rubble of my house.", VOICE_RESIDENT, 43);
            sintetizaESalvaAudio("Yes, here — my things were here on the street.", VOICE_RESIDENT, 44);
            sintetizaESalvaAudio("Everything, stove, everything, on that sofa.", VOICE_RESIDENT, 45);
            sintetizaESalvaAudio("I tried to rent a room, but with children, I couldn’t.", VOICE_RESIDENT, 46);
            sintetizaESalvaAudio("I only saw one option: return to the neighborhood.", VOICE_RESIDENT, 47);
            sintetizaESalvaAudio("I said, “I have to build again.”", VOICE_RESIDENT, 48);
            sintetizaESalvaAudio("Did you rebuild the house?", VOICE_INTERVIEWER, 49);
            sintetizaESalvaAudio("Yes, I rebuilt it.", VOICE_RESIDENT, 50);
            sintetizaESalvaAudio("And now I’m not leaving.", VOICE_RESIDENT, 51);
            sintetizaESalvaAudio("They can come with the police,", VOICE_RESIDENT, 52);
            sintetizaESalvaAudio("but they won’t take me from here.", VOICE_RESIDENT, 53);
            sintetizaESalvaAudio("They won’t because we don’t accept it.", VOICE_RESIDENT, 54);
            sintetizaESalvaAudio("Look, this time we’ll train karate — we’ll fight.", VOICE_RESIDENT, 55);
            sintetizaESalvaAudio("At a time when so much is said about demolishing shacks,", VOICE_INTERVIEWER, 56);
            sintetizaESalvaAudio("this case shows what happens when you destroy a house,", VOICE_INTERVIEWER, 57);
            sintetizaESalvaAudio("but don’t solve the root problem.", VOICE_INTERVIEWER, 58);
            sintetizaESalvaAudio("Vilma is also back in the neighborhood.", VOICE_INTERVIEWER, 59);
            sintetizaESalvaAudio("I built once — the bed broke.", VOICE_INTERVIEWER, 60);
            sintetizaESalvaAudio("I stayed in a shelter for two months or so,", VOICE_INTERVIEWER, 61);
            sintetizaESalvaAudio("then on the street.", VOICE_INTERVIEWER, 62);
            sintetizaESalvaAudio("They usually left me out on the street.", VOICE_INTERVIEWER, 63);
            sintetizaESalvaAudio("So, since I had nowhere to go, I came to build again.", VOICE_INTERVIEWER, 64);
            sintetizaESalvaAudio("Vilma was born in Príncipe. She has four children.", VOICE_INTERVIEWER, 65);
            sintetizaESalvaAudio("She knows the house where she lives is in poor condition.", VOICE_INTERVIEWER, 66);
            sintetizaESalvaAudio("Still, it’s better than where the City Hall left her.", VOICE_INTERVIEWER, 67);
            sintetizaESalvaAudio("Of course it’s worse.", VOICE_INTERVIEWER, 68);
            sintetizaESalvaAudio("Look, if they didn’t have a house for someone,", VOICE_RESIDENT, 69);
            sintetizaESalvaAudio("they shouldn’t put that person on the street.", VOICE_RESIDENT, 70);
            sintetizaESalvaAudio("Because now, more or less, we’re not on the street.", VOICE_RESIDENT, 71);
            sintetizaESalvaAudio("But when they demolish, they don’t solve the problem.", VOICE_RESIDENT, 72);
            sintetizaESalvaAudio("That’s what happens.", VOICE_RESIDENT, 73);
            sintetizaESalvaAudio("It may not seem like it,", VOICE_INTERVIEWER, 74);
            sintetizaESalvaAudio("but we are 10 kilometers from a European capital.", VOICE_INTERVIEWER, 75);
            sintetizaESalvaAudio("Just here in Corroios, the shantytown already takes up", VOICE_INTERVIEWER, 76);
            sintetizaESalvaAudio("nearly 40,000 square meters.", VOICE_INTERVIEWER, 77);
            sintetizaESalvaAudio("Those who arrive often have family here —", VOICE_INTERVIEWER, 78);
            sintetizaESalvaAudio("and it’s within these relationships that the community grows.", VOICE_INTERVIEWER, 79);
            sintetizaESalvaAudio("Most residents came from São Tomé and Príncipe.", VOICE_INTERVIEWER, 80);
            sintetizaESalvaAudio("They’re here for many reasons — rarely by choice.", VOICE_INTERVIEWER, 81);
            sintetizaESalvaAudio("Nilsa arrived in 2018 with her daughter,", VOICE_INTERVIEWER, 82);
            sintetizaESalvaAudio("who had leukemia and came for treatment.", VOICE_INTERVIEWER, 83);
            sintetizaESalvaAudio("The disease was serious.", VOICE_INTERVIEWER, 84);
            sintetizaESalvaAudio("Blood cancer.", VOICE_INTERVIEWER, 85);
            sintetizaESalvaAudio("She passed away.", VOICE_INTERVIEWER, 86);
            sintetizaESalvaAudio("She felt that pain and said,", VOICE_RESIDENT, 87);
            sintetizaESalvaAudio("“I came with my daughter, both feet together.", VOICE_RESIDENT, 88);
            sintetizaESalvaAudio("Alone back to my country, her dead here — I couldn’t.”", VOICE_RESIDENT, 89);
            sintetizaESalvaAudio("I felt a kindness, a pain — and I decided to stay.", VOICE_RESIDENT, 90);
            sintetizaESalvaAudio("She’s here. If one day I die here,", VOICE_RESIDENT, 91);
            sintetizaESalvaAudio("it’s okay.", VOICE_RESIDENT, 92);
            sintetizaESalvaAudio("My piece of me is here, in the ground.", VOICE_RESIDENT, 93);
            sintetizaESalvaAudio("Since she arrived in Portugal four years ago,", VOICE_INTERVIEWER, 94);
            sintetizaESalvaAudio("living in this neighborhood has been Nilsa’s only option.", VOICE_INTERVIEWER, 95);
            sintetizaESalvaAudio("I lost my job, because it didn’t have a contract.", VOICE_RESIDENT, 96);
            sintetizaESalvaAudio("I worked nine months at the agency.", VOICE_RESIDENT, 97);
            sintetizaESalvaAudio("Also worked as a babysitter.", VOICE_RESIDENT, 98);
            sintetizaESalvaAudio("But I didn’t get anything.", VOICE_RESIDENT, 99);
            sintetizaESalvaAudio("It was taken.", VOICE_RESIDENT, 100);
            sintetizaESalvaAudio("Someone else took my place.", VOICE_RESIDENT, 101);
            sintetizaESalvaAudio("I work from ten, leave at 3:15,", VOICE_RESIDENT, 102);
            sintetizaESalvaAudio("then go back in and leave at 9:21.", VOICE_RESIDENT, 103);
            sintetizaESalvaAudio("And do the people at the restaurant — your job —", VOICE_INTERVIEWER, 104);
            sintetizaESalvaAudio("know you live in the neighborhood?", VOICE_INTERVIEWER, 105);
            sintetizaESalvaAudio("No. No.", VOICE_RESIDENT, 106);
            sintetizaESalvaAudio("The reality of shantytowns spreads through Greater Lisbon.", VOICE_INTERVIEWER, 107);
            sintetizaESalvaAudio("There are 27 identified neighborhoods.", VOICE_INTERVIEWER, 108);
            sintetizaESalvaAudio("One of the municipalities with the most is Almada.", VOICE_INTERVIEWER, 109);
            sintetizaESalvaAudio("Within 5 kilometers, there are 3 neighborhoods.", VOICE_INTERVIEWER, 110);
            sintetizaESalvaAudio("Hundreds of families saw this as the only way", VOICE_INTERVIEWER, 111);
            sintetizaESalvaAudio("to have something resembling a home.", VOICE_INTERVIEWER, 112);
            sintetizaESalvaAudio("Is it hard to find a house?", VOICE_INTERVIEWER, 113);
            sintetizaESalvaAudio("Yes, very hard.", VOICE_INTERVIEWER, 114);
            sintetizaESalvaAudio("Rooms appear, but with a baby —", VOICE_INTERVIEWER, 115);
            sintetizaESalvaAudio("they don’t accept.", VOICE_INTERVIEWER, 116);
            sintetizaESalvaAudio("Six months old.", VOICE_INTERVIEWER, 117);
            sintetizaESalvaAudio("The Raposo neighborhood, with a view of the 25 de Abril bridge,", VOICE_INTERVIEWER, 118);
            sintetizaESalvaAudio("was built in plain sight of everyone —", VOICE_INTERVIEWER, 119);
            sintetizaESalvaAudio("ironically, on land owned by the Housing Institute.", VOICE_INTERVIEWER, 120);
            sintetizaESalvaAudio("With piped water, pulled directly from the mains,", VOICE_INTERVIEWER, 121);
            sintetizaESalvaAudio("and electricity stolen from the public grid.", VOICE_INTERVIEWER, 122);
            sintetizaESalvaAudio("On Monday, the Almada City Hall came and posted notices.", VOICE_INTERVIEWER, 123);
            sintetizaESalvaAudio("I read some — I understood it means", VOICE_INTERVIEWER, 124);
            sintetizaESalvaAudio("we can’t build anything else.", VOICE_INTERVIEWER, 125);
            sintetizaESalvaAudio("Are you afraid the City Hall will demolish the houses?", VOICE_RESIDENT, 126);
            sintetizaESalvaAudio("Of course I’m afraid.", VOICE_RESIDENT, 127);
            sintetizaESalvaAudio("Whether they want to or not?", VOICE_RESIDENT, 128);
            sintetizaESalvaAudio("No clear answer.", VOICE_INTERVIEWER, 129);
            sintetizaESalvaAudio("Only hope that if demolition comes,", VOICE_INTERVIEWER, 130);
            sintetizaESalvaAudio("it’s followed by real housing,", VOICE_INTERVIEWER, 131);
            sintetizaESalvaAudio("paid by PRR funds —", VOICE_INTERVIEWER, 132);
            sintetizaESalvaAudio("and finally, something as simple as a home.", VOICE_INTERVIEWER, 133);
            sintetizaESalvaAudio("Does the mailman come here?", VOICE_RESIDENT, 134);
            sintetizaESalvaAudio("No, there’s no mail service here.", VOICE_RESIDENT, 135);
            sintetizaESalvaAudio("The mailman doesn’t come, and the authorities come", VOICE_RESIDENT, 136);
            sintetizaESalvaAudio("once in a while.", VOICE_RESIDENT, 137);
            sintetizaESalvaAudio("Others find their own path.", VOICE_INTERVIEWER, 138);
            sintetizaESalvaAudio("Man dominates man only for his own harm.", VOICE_RESIDENT, 139);
            sintetizaESalvaAudio("Even if they want, they can’t.", VOICE_RESIDENT, 140);
            sintetizaESalvaAudio("Only the Kingdom of God.", VOICE_RESIDENT, 141);
            sintetizaESalvaAudio("Here in Raposo — and in Talude, in Loures, or Corroios in Seixal —", VOICE_INTERVIEWER, 142);
            sintetizaESalvaAudio("conditions are close to inhumane.", VOICE_INTERVIEWER, 143);
            sintetizaESalvaAudio("Humans are only the residents —", VOICE_INTERVIEWER, 144);
            sintetizaESalvaAudio("who, despite everything, manage to teach optimism.", VOICE_INTERVIEWER, 145);
            sintetizaESalvaAudio("Look, in life, nothing is easy.", VOICE_RESIDENT, 146);
            sintetizaESalvaAudio("Nothing.", VOICE_RESIDENT, 147);
            sintetizaESalvaAudio("If it were easy, it wouldn’t be fun.", VOICE_RESIDENT, 148);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 
     * @param texto the text 
     * @param voiceId
     * @param index
     * @throws IOException
     */
    public static void sintetizaESalvaAudio(String texto, String voiceId, int index) throws IOException {
        String urlStr = "https://api.elevenlabs.io/v1/text-to-speech/" + voiceId;
        URL url = new URL(urlStr);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();

        con.setRequestMethod("POST");
        con.setRequestProperty("accept", "audio/mpeg");
        con.setRequestProperty("xi-api-key", API_KEY);
        con.setRequestProperty("Content-Type", "application/json");
        con.setDoOutput(true);

        String jsonInputString = "{\"text\":\"" + texto.replace("\"", "\\\"") + "\"}";

        try (OutputStream os = con.getOutputStream()) {
            byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
            os.write(input, 0, input.length);
        }

        int code = con.getResponseCode();
        if (code != 200) {
            System.out.println("Erro HTTP: " + code);
            InputStream errorStream = con.getErrorStream();
            if (errorStream != null) {
                BufferedReader br = new BufferedReader(new InputStreamReader(errorStream, StandardCharsets.UTF_8));
                StringBuilder response = new StringBuilder();
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
                System.out.println("Erro: " + response.toString());
            }
            return;
        }

        InputStream is = con.getInputStream();
        String nomeArquivo = "fala_" + index + ".mp3";
        FileOutputStream fos = new FileOutputStream(nomeArquivo);

        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = is.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        fos.close();
        is.close();

        System.out.println("Áudio salvo: " + nomeArquivo);
    }
}