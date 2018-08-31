import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

class InlineMenu {

    static void mainMenu(SendMessage message){
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        rowInline.add(new InlineKeyboardButton().setText("Building, construction").setCallbackData("/building"));
        // Set the keyboard to the markup
        rowsInline.add(rowInline);
        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        rowInline1.add(new InlineKeyboardButton().setText("Transport, moving, repairing").setCallbackData("/transport"));
        rowsInline.add(rowInline1);
        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
        rowInline2.add(new InlineKeyboardButton().setText("Weddings").setCallbackData("/weddings"));
        rowsInline.add(rowInline2);
        List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
        rowInline3.add(new InlineKeyboardButton().setText("Travel, tourism").setCallbackData("/travel"));
        rowsInline.add(rowInline3);
        // Add it to the message
        markupInline.setKeyboard(rowsInline);
        message.setReplyMarkup(markupInline);

    }

    static void buildingMenu(EditMessageText message){
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline = new ArrayList<>();
        rowInline.add(new InlineKeyboardButton().setText("Cleaning").setCallbackData("/cleaning"));
        // Set the keyboard to the markup
        rowsInline.add(rowInline);
        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        rowInline1.add(new InlineKeyboardButton().setText("Realty").setCallbackData("/transport"));
        rowsInline.add(rowInline1);
        List<InlineKeyboardButton> rowInline2 = new ArrayList<>();
        rowInline2.add(new InlineKeyboardButton().setText("Air conditioning").setCallbackData("/weddings"));
        rowsInline.add(rowInline2);
        List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
        rowInline3.add(new InlineKeyboardButton().setText("Plumbers").setCallbackData("/travel"));
        rowsInline.add(rowInline3);
        // Add it to the message
        markupInline.setKeyboard(rowsInline);
        message.setReplyMarkup(markupInline);
    }


}
