package tech.diop.portfoliov2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import tech.diop.portfoliov2.model.Project;
import tech.diop.portfoliov2.repositories.ProjectRepository;

import java.util.List;

@Controller
public class ProjectController {

    @Autowired
    private ProjectRepository projectRepository;

    @GetMapping ("/projects")
    public String projects(Model model) {
        List<Project> projects = projectRepository.findAll();
        model.addAttribute("projects", projects);
        return "projects/projects";
    }

    @GetMapping ("/project/{id}")
    public String projectDetails(@PathVariable Integer id, Model model) {
        Project project = projectRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid project Id:" + id));
        model.addAttribute("project", project);
        return "projects/project-details";
    }
}
