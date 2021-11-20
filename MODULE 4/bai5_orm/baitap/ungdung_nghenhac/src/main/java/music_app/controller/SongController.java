package music_app.controller;


import music_app.model.Song;
import music_app.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller(value = "song")
@RequestMapping(value = "/song")
public class SongController {
    @Autowired
//    private final ISongService songService = new SongService();
    private  ISongService songService ;

    @GetMapping(value = "")
    public String showList(Model model) {
        model.addAttribute("songList", songService.showListSong());
        return "list";
    }

    @GetMapping(value = "/{id}/edit")
    public String showEdit(@PathVariable int id, Model model) {
        model.addAttribute("song", songService.showDetailSong(id));
        return "edit";
    }

    @GetMapping(value = "/{id}/view")
    public String showView(@PathVariable int id, Model model) {
        model.addAttribute("song", songService.showDetailSong(id));
        return "view";
    }

    @PostMapping(value = "/edit")
    public String edit(@ModelAttribute Song song, Model model, RedirectAttributes redirect) {
        songService.editSong(song);
        redirect.addFlashAttribute("success", "Edit song successfully!");
        return "redirect:/song";
    }

    @GetMapping(value = "/create")
    public String showCreateForm(Model model) {
        model.addAttribute("song", new Song());
        return "create";
    }

    @PostMapping(value = "/create")
    public String create(@ModelAttribute Song song, RedirectAttributes redirect) {
        songService.addSong(song);
        redirect.addFlashAttribute("success", "Create song successfully!");
        return "redirect:/song";
    }
    @GetMapping(value = "/{id}/delete")
    public String showDelete(@PathVariable int id, Model model) {
        model.addAttribute("song", songService.showDetailSong(id));
        return "delete";
    }
    @PostMapping(value = "/delete")
    public String delete(@RequestParam int id, Model model, RedirectAttributes redirect) {
        songService.delete(id);
        redirect.addFlashAttribute("success", "Delete song successfully!");
        return "redirect:/song";
    }
    @PostMapping(value = "/search")
    public String search(@RequestParam String songName, Model model) {
        List<Song> songList = songService.searchName(songName);
        model.addAttribute("songList",songList);
        return "list";
    }
}
