/*String continuar = "s";
    int numQuarto = 1;

    
    System.out.println("Informe se o quarto está \"livre\" ou \"ocupado\":");

    for (int i = 0; i < 20; i++) {
      System.out.println("Quarto " + ((int)i + 1));
      quarto[i] = in.nextLine();
      quarto[i].toLowerCase();

      if ((! quarto[i].equals("livre")) && (! quarto[i].equals("ocupado"))) {
        System.out.println("Entrada inválida. Use \"livre\" ou \"ocupado\".");
        i--;

      } else {
        System.out.println("Deseja continuar?");
        String resposta = in.nextLine();
        resposta = resposta.toLowerCase();

        if ((! resposta.equals(continuar)) && (! resposta.equals("n"))) {
          System.out.println("Entrada inválida. Use \"S\" ou \"N\".");
          
        } else {
          if (continuar.equals("n")) {
            for (int j = 0; j < i; j++) {
              System.out.println(numQuarto + "-" + quarto[j]);
              numQuarto++;
            }

            for (int j = i; j <= i; j++) {
              System.out.println(numQuarto + "-" + quarto[j]);
              numQuarto++;
              
            }
          }
        }
      }
    }*/