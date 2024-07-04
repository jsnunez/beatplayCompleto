package com.jsnunez.View;

import java.util.Scanner;

public class PaginaPrincipal {

    public static int  start(Scanner sc) {

        System.out.println("1. Iniciar Sesion");
        System.out.println("2. Salir");

        int opcion = sc.nextInt();
sc.nextLine();
switch (opcion) {
    case 1:
    System.out.println("Bienvenido al inicio de Sesion");
        break;
        case 2:

    String[] items={
        
"        ...,cdd;.......        .,'             ;c'     .cc.     ':;lxdl;'....           .  .:'       .                   .';c:,,cddc..   ;OKk;            ,xOOk;     ...   ",
"        ..',:do'.......        .'.             ,c'     .ox,     ';.':ool:;,.               .,.    ....                   ..;c:,,cdxl'.   'loo,            .o00k,     ;x:   ",
"          ...,;.               ;ol.            ...     .',.     .'. ..,,...                      .....                    .',,.';ldl,.   .;l:.            'x00o.     ,:'   ",
"            .ld,              .:xo.            ,l;.    .ll.     ',.                              'lo,                      .....,ldl,.   .cdc.            ;kOk:            ",
"            'oc.               ,l:.            ,c.     .:c.     .'.                     .        .dd.                           .....      .              ;kOkc.           ",
"           .,c;.               ;o:.            ..       ..      .'.                    .'.        ,,.                            ..       ...             ;kOOx,          .",
"          .,dkkl.              ';'.            ..      .:l.     ..  ..;;;..    .;c.    ...       .lo.                            ..        ..             .dOOx,          .",
"         .;oxkkl'.             .'..                     ',.     ....';,',,..   .lo'     ..        ',.                                                     .oOOk;          .",
"        ..,:oxkxc'.           .;lc'            ..               ....,'....'.    ...    ...       .cc,              .                      .'.             ,kOkd'          .",
"         ..,d00kd;..          .cl:.            .'.      .'      ....'.. ..'.   .,c,    .;'       ,x0l.             ..                      .           .. ,kkc'.           ",
" .'.      ..cxkxo;..          .cdc.             .        .      ....'.. ..'..   ..     .'.    ....:l;.                                                 .'.'dkxo'          .",
" .,.       .:xkxl,...         .:kx,                      .      ......   ...    ..     .'.     ...lx:.             .                                   .. .cxkx,          .",
" .'.       .lOOxo:;'...        ;xd'            ...      .'.     .,.            .ld,    .'.       .,:'                                                  ..  .cxd'          .",
" ..        .:dxxdolc'..        ;xo'             .               ..              .'.     ..        .'.                            ..                    .. .cxxd'          .",
" .,.       .'ldddl;,....      .:Ox,            .'.              .. ..,,..      'od;     .         :l.             .'.            ..                    .. .lOko.          .",
" .'.        ;k0kdolc:;'.      .:ko.            .:.              .. ..,:c,.     .dd'               .'              .,.            ..                    ..  ;kOl.           ",
" .,.        'dd;,,;;,,..      .c0x,             .               .,. ..,:,.      ,;.               '.              ':.           .,,.                   .. .;dxc.          .",
" .'.        'do.              .oXO;            .:'              ... ..';,.      :o.              .,,.            .cxc.       ......                     .  ,c:,.          .",
" ':.        .:;.              .dXk,            'c.              .,. .';;'.      ..                ..             .lxc.      .....''.                   ..  ;lc.           .",
" ',.        .:;.             .cKNKo.           ...              ..    ....      ',.              .,:'            .oko.    .......::.                    .  'cc'           .",
" ...        ,xo.             .oXNXd.          .;c:.             ..              ,l'              .',.            .oko.    .......'..                       .';'            ",
" .'.        .:c;'.            ;k0k;.           ':,.             ''               .                ..             .:o,     ..''...,..                       .,'.           .",
".:o'       .;dkkl'.           .oOk:.           ...              .'              .,.               ,;.            .;o:.    ..''...,..                       .:,.           .",
" .,.      ..oK0kd;..          .lkd,           'ld:.                             ..                 .             .cd:.     ........                        .,;,.           ",
" .;.      .,dOkkdc'.          'x0x'           .:l,.                             ..                ..             'oxc.          .'.                        .',.            ",
" .,.     ..cOKKKkl,....       ;0NKl.          .;o;.                             ,:.               ..             'oko.          ..                         .,'.            ",
" .;.    ..,o0NNKkdl:;,'..     ;OX0l.          .o0d.                             .'                               .;c'            ..                        .,,.            ",
" .:.    .'cxOK0kxkkkdo:..     ,kK0c.          .;l:.                             ..                .'              ':.            ..                        ..'.            ",
" ,l.    ..;dKNKOxxxoc:,..     ;ONKl.           .'.                              ',.               ...             .,.             .              .      .  ,cc,            ",
" ,c'     ..:kK0kxl:'....      .o0x,            ,d:.                              .                .:.              ..            ..                       .:ol'            ",
" ':'       .lOOo:'..          .:xl.            .'.                              .'.                .               ..        ......                        ';;.            ",
" ':.       .xNKl..            .:xo.            ...                              ...               ..                         ....'.                        .','            ",
" ,:.       .ckk:.              'c;.            .;'                              ..                .;.              ..         ...,,.             .         ....            ",
" ;o'        .;;..              ...              .                               .,.               ..              ...           ...                        ''..            ",
" .;.       .:OOc'..            .;,                                     .         .                ''               .            .,'.                       .'..            ",
" ':.       .:xOxc,..           .'.              .                               ..             .  .'              ...           .,,.                       ';;.            ",
" .;.       .,oxxo,..            ..                                              .'             ..  .              ...           ....                       .::.            ",
" ;o,       .oK0kl'..           .''             ...                              ..             . .':'.            ...         ......             .         'll,            ",
" .,.       .;ool:'..           ...             ','                              .;.            .  ...             ':'        .......                      .:xk:            ",
" ':.        .;:,,,...                           .                               ..             .. .'.             .'.        ....,'.            ..         'dk;            ",
" ';.        ;xd;,'..                           ,c,                             .;;.            .. ':'.            'c,       .....,,.            ..        .ckkl.           ",
" ;c.        .:c::'..                           ':'                             ,xk:.           .. ...             ,o;.        .....             ...       'xOkl.           ",
" .,.   ';. .;xxol,..      .;.                                      ....;c,.     ..             .. ,:.             ,c,           .,'             .'.       ,xOO:            ",
" ';.  .ok;..d00xc'..      .'.        .;;.     .,;'.               ..,'':ol;..   ';.           .,. ';.            .:xl.          ...             .'.       ,dOx;           .",
" ...   ';. .;cc;..        .,.        .,,.      .,,.              .'clc;;;co:.   .'.            .. ';.            .:xo'           ..             .,.       'okko.          .",
" .'.  .'::..'cc.          ...       .:oo:.     .,.               .,ldoccodd;.  .c:.           .;,.lx,.           .:xd'      .....''             ';.       'okkd,          .",
" ';.  .;c;. .,'.          'l,       .xNXl.    .okc.              .;oxddddl,.   .ox;           .ll,:c,.           .lkx:     ........             ,;.       .:llc.          .",
" ';.   ...                ,c,       .:0d.     .;c,               ..,;;;;,..     ''.           .cccdxl'.          .:dc.    ..',,....             ...         ...           ,",
"      .okl.  .           .l0c        :Ok,                             .cd:.    .cl'           .:clxxc.           .ckl.    ..';:;,:;.            ',.                      .:",
"      'dkl'..........     ;o'       .oNXl                             .:d:.    .dk,           .,:;:;..           .lOo.    ..,;::;:;.            cd'                       '"

    };
            
        for (String item : items) {
            System.out.println(item);
            try {
                Thread.sleep(5 * 5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        
        System.out.println("saliendo del programa");
        System.exit(0);
            break;
    default:
    System.out.println("Error valor no valido");
        break;
}
   
return opcion;
    }
}
