import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.toIntExact;

public class Bot extends TelegramLongPollingBot {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        try {
            telegramBotsApi.registerBot(new Bot());
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onUpdateReceived(Update update) {

        if (update.hasMessage() && update.getMessage().hasText()) {
            String message_text = update.getMessage().getText();
            long chat_id = update.getMessage().getChatId();

            if (update.getMessage().getText().equals("/start")) {
                SendMessage helloMessage = buildMsg(chat_id, "Hey, Welcome to Limassol Help Bot!");
                Keyboard.setMainKeyboard(helloMessage);
                sendMsg(helloMessage);

                System.out.println("Name: " + update.getMessage().getFrom().getFirstName() + " " + update.getMessage().getFrom().getLastName());
                System.out.println("ChatId: " + update.getMessage().getFrom().getId());
                System.out.println("Nick Name: @"+ update.getMessage().getFrom().getUserName());
                System.out.println("Language code: "+ update.getMessage().getFrom().getLanguageCode());
                System.out.println("");

                SendMessage message = buildMsg(chat_id, "Menu");
                InlineMenu.mainMenu(message);
                sendMsg(message);
            }
            else if (update.getMessage().getText().equals("Menu")){
                SendMessage message = buildMsg(chat_id, "Menu");
                InlineMenu.mainMenu(message);
                sendMsg(message);
            }

        } else if (update.hasCallbackQuery()) {
            String call_data = update.getCallbackQuery().getData();
            int message_id = update.getCallbackQuery().getMessage().getMessageId();
            long chat_id = update.getCallbackQuery().getMessage().getChatId();

            if (call_data.equals("/building")) {
                EditMessageText message = buildEditedMsg(chat_id, message_id, "Building, construction:");
                InlineMenu.buildingMenu(message);
                sendMsg(message);

            } else if (call_data.equals("/cleaning")) {
                SendMessage message = buildMsg(chat_id, "Nikita Pozdnyakov \uD83C\uDDF7\uD83C\uDDFA\uD83C\uDDEC\uD83C\uDDE7\uD83C\uDDEC\uD83C\uDDF7\n" +
                        " \uD83D\uDCF2 +357 96 011213\n" +
                        " [\uD83D\uDCAC Telegram](tg://resolve?domain=npozdn)\n" +
                        " [\uD83D\uDCAC WhatsApp](https://wa.me/35796011213)\n " +
                        "\uD83D\uDCB2 7€/h");
                SendMessage message1 = buildMsg(chat_id, "Ivan Petrov \uD83C\uDDF7\uD83C\uDDFA\uD83C\uDDEC\uD83C\uDDE7\uD83C\uDDEC\uD83C\uDDF7\n" +
                        " \uD83D\uDCF2 +357 96 055667\n" +
                        " [\uD83D\uDCAC Telegram](tg://resolve?domain=npozdn)\n" +
                        " [\uD83D\uDCAC WhatsApp](https://wa.me/35796011213)");

                sendMsg(message);
                sendMsg(message1);
            }
        }
    }

    public synchronized SendMessage buildMsg(long chatId, String text) {
        SendMessage message = new SendMessage();
        message.enableMarkdown(true);
        message.setChatId(chatId);
        message.disableWebPagePreview();
        message.setText(text);
        return message;
    }
    public void sendMsg(SendMessage message){
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    public void sendMsg(EditMessageText message){
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    public synchronized EditMessageText buildEditedMsg(long chatId, int message_id, String text) {
        EditMessageText message = new EditMessageText();
        message.enableMarkdown(true);
        message.setChatId(chatId);
        message.setText(text);
        message.setMessageId(message_id);
        return message;
    }
            @Override
            public String getBotUsername () {
                return "CyprusHelpBot";
            }
            @Override
            public String getBotToken () {
                return "662010143:AAEJ9lVySa8dKXJ83sksAQ1mDex54Tw_vH8";
            }

        }
