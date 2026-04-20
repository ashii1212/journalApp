package com.mentornxt.journalApp.controller;

import com.mentornxt.journalApp.entity.JournalEntry;
import com.mentornxt.journalApp.service.JournalEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("/journal")
public class JournalEntryControllerV2
{
  @Autowired
   private JournalEntryService journalEntryService;

    @GetMapping
    public List<JournalEntry> getAll() {
        return journalEntryService.getAll();
    }
    @PostMapping
    public JournalEntry createEntry(@RequestBody JournalEntry myEntry)
    {
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return myEntry;
    }
    @GetMapping("/Id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable String myId)
    {
         return null;
    }
    @DeleteMapping("/Id/{myId}")
    public JournalEntry deleteEntryById(@PathVariable String myId){

        return null;
    }


}
