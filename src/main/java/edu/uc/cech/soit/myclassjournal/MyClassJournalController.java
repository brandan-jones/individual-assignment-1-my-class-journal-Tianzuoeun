package edu.uc.cech.soit.myclassjournal;

import edu.uc.cech.soit.myclassjournal.dto.JournalEntry;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyClassJournalController
{

    /**
     * Handle the / endpoint
     * @return
     */

    @RequestMapping("/")
    public String start()
    {
        JournalEntry journalEntry = new JournalEntry();
        journalEntry.setNotes("");
        String desc = journalEntry.getNotes();
        return "start";
    }


}
