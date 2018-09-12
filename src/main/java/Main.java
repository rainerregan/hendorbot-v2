import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {

    public static void main(String[] args) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "NDg4ODk5MTQ3NDM3NTcyMDk5.Dni-Bg.b4ZPH8LFseYbG9c2U0LveLICfxE";
        builder.setToken(token);
        builder.addEventListener(new Main());
        builder.buildAsync();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        if (event.getAuthor().isBot()){
            return;
        }

        System.out.println("Message received from " +
                event.getAuthor().getName() + ":" +
                event.getMessage().getContentDisplay()
        );

        if (event.getMessage().getContentRaw().equals("!ping")){
            event.getChannel().sendMessage("Pong!").queue();
        }
        if (event.getMessage().getContentRaw().equals("Halo ndor") || event.getMessage().getContentRaw().equals("halo ndor")){
            event.getChannel().sendMessage("HALO BOSQ!").queue();
        }

    }
}
