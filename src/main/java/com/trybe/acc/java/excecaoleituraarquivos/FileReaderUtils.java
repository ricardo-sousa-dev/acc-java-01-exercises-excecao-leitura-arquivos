package com.trybe.acc.java.excecaoleituraarquivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/** Classe do desafio. */
public class FileReaderUtils {

  /** Retorna a primeira linha de um arquivo. */
  public String getFirstLine() throws FileNotFoundException {
    BufferedReader reader = new BufferedReader(new FileReader("arquivo_nao_existente.txt"));
    try {

      return reader.lines().findFirst().get();

    } finally {
      try {
        reader.close();
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
  }

  // public class FileNotFoundException extends Exception {

  // public FileNotFoundException() {
  // super("Arquivo não existe");
  // }
  // }

  public static void main(String[] args) {
    FileReaderUtils fileReaderUtils = new FileReaderUtils();
    try {
      System.out.println(fileReaderUtils.getFirstLine());
    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não existe");
    }
  }
}

// public class FileReaderUtils {

// /** Retorna a primeira linha de um arquivo. */
// public String getFirstLine() throws FileNotFoundException {
// BufferedReader reader = new BufferedReader(new
// FileReader("arquivo_nao_existente.txt"));
// try {
// return reader.lines().findFirst().get();

// } finally {
// try {
// if (reader != null) {
// reader.close();
// }
// } catch (FileNotFoundException e) {
// throw new FileNotFoundException();
// } catch (IOException e) {
// System.out.println(e.getMessage());
// }
// }
// }
// }

// public class FileReaderUtils {

// /** Retorna a primeira linha de um arquivo. */
// public String getFirstLine() throws FileNotFoundException {
// BufferedReader reader = new BufferedReader(new
// FileReader("arquivo_nao_existente.txt"));
// try {
// return reader.lines().findFirst().get();

// } catch (Throwable e) {
// System.out.println("Arquivo não existe");
// } finally {
// if (reader != null) {
// try {
// reader.close();
// } catch (IOException e) {
// e.printStackTrace();
// }
// }
// }
// return null;
// }
