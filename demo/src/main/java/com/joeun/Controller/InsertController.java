package com.joeun.Controller;

import com.joeun.DTO.Board;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class InsertController {

    @FXML
    private TextArea tContent;

    @FXML
    private TextField tTitle;

    @FXML
    private TextField tWriter;

    @FXML
    void insert(ActionEvent event) {
        // boardService.insert(Board) 힌트
    }
}
