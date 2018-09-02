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
        rowInline1.add(new InlineKeyboardButton().setText("Childcare").setCallbackData("/childcare"));
        rowInline1.add(new InlineKeyboardButton().setText("Clothing").setCallbackData("/clothing"));
        rowsInline.add(rowInline1);

        List<InlineKeyboardButton> rowInline3 = new ArrayList<>();
        rowInline3.add(new InlineKeyboardButton().setText("Design, photo").setCallbackData("/photo"));
        rowInline3.add(new InlineKeyboardButton().setText("Entertainment").setCallbackData("/entertainment"));
        rowsInline.add(rowInline3);

        List<InlineKeyboardButton> rowInline5 = new ArrayList<>();
        rowInline5.add(new InlineKeyboardButton().setText("Finance, legal").setCallbackData("/finance"));
        rowInline5.add(new InlineKeyboardButton().setText("Food, drink").setCallbackData("/food"));
        rowsInline.add(rowInline5);

        List<InlineKeyboardButton> rowInline7 = new ArrayList<>();
        rowInline7.add(new InlineKeyboardButton().setText("IT, computers, telecoms").setCallbackData("/it"));
        rowsInline.add(rowInline7);

        List<InlineKeyboardButton> rowInline8 = new ArrayList<>();
        rowInline8.add(new InlineKeyboardButton().setText("Pets").setCallbackData("/pets"));
        rowInline8.add(new InlineKeyboardButton().setText("Property").setCallbackData("/property"));
        rowsInline.add(rowInline8);

        List<InlineKeyboardButton> rowInline10 = new ArrayList<>();
        rowInline10.add(new InlineKeyboardButton().setText("Transport, moving, repairing").setCallbackData("/transport"));
        rowsInline.add(rowInline10);

        List<InlineKeyboardButton> rowInline11 = new ArrayList<>();
        rowInline11.add(new InlineKeyboardButton().setText("Travel, tourism").setCallbackData("/travel"));
        rowsInline.add(rowInline11);

        List<InlineKeyboardButton> rowInline12 = new ArrayList<>();
        rowInline12.add(new InlineKeyboardButton().setText("Tuition, classes").setCallbackData("/tuition"));
        rowsInline.add(rowInline12);

        List<InlineKeyboardButton> rowInline13 = new ArrayList<>();
        rowInline13.add(new InlineKeyboardButton().setText("Weddings").setCallbackData("/weddings"));
        rowsInline.add(rowInline13);

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
