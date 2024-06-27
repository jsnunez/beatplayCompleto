package com.jsnunez.View;

public class Portada {
public void start(){



    String[] items = {
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX00NXOddO0OxO0OOOO00KXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWNXKKk:',;,................';lxKNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKd:'''..........................,ckXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0d,.  ......................  .....'ck0XWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0d:... ............... ..   .        ...',:dKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXx,.. .................    . ..          ....'cONMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWOc'........... . .............                .'ckXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk,....       .  . ..........                   ..':dKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMKc....           .........                       ..,:o0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWx'.. .          ..    ...    .                    .',;oKWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXl...             ..   .....  .                     .',:dXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0:..                  ......                         ..,cOWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0;..                 ..........                       ..'oXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0;.                  .. ..... ..                      ...:0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0:.                   .........     ........          ...,kWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMK:.                   ........',:cclloodooolc:;;,'... ....oNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0;.                   ...,:codkkkkkkxxxxdddooolllcc:,,,...cXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO,.                 .':ldkOOkkkkkkkxxddxddddddooolcc:oOd. :KMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWx'                .;ldkOOOOOOkkkkkkkxxxxxxxxdddddlc:,,cxc.;KMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXc.              .;looddkkOOOOkkkkkkxxxdddddoolcc;'..   .:',0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0,             .;ooooolcc::;;;;:cloodddoollc:,'..   .....lc;kWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMX:           .,ldddoc::;,'...  ...',;clcc:;'..   ..',''',odckWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWo.         .cddddocccc:;:c:,'.    ..;:::;'.  ....''. .;cokdkWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWo         'coddxxolc:;;:lodl'.   ..;coddl;...'..',,'..:ox0O0WMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk.       .;cloddddolll::lxkx:..',:oddkOOxc,,,,'.......,;oOKXWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXc      .,;clodxxxxdddolccc;,,',cxOOkk00Oo:;:::;;,,,;;::cx0XWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNo.    .c:,:codxkkkkxdol:;;,',;lk00OkkO0Oxc;;:clllodoooccx0XWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWk;   .;clc:;clodxkkkkOkxdoloodxkkkOkkO000ko:;;::coodoolccokXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNk,.  .;dxdlc:cclodxxkkOOOOkkkkxxxxkkkkkO0K0xl:cc:::lllcc:;:dXMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM0:      .',;:::cclooddxkkkkkxxxddddxOOOOO000ko:llc:;:;;;;,,;xNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKl.        'ccccccclloddxxxdddoloodxxdolloooc;.....,;,,''.':0MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0:         .locccccclllooooooollodoc,...'''.....''',,,''..,xNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMK:.         :oc:cc:::cclcccllloodxxxxxxkkdc;;clc;;;,,'''.'cKMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNo.         'lc::ccc:::cccccoddxkkkkkO00Oxddxxoc;,,,c:...,xNMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWO,     ...  .:l:;:ccc:::ccccloooddxxxxdlc;,'''..     ...';dKXNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNk;.    ,:.    'c:;;::c::::::ccc:::;:;'.......;:'.   ....'.'lkl:lxOKXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNx:;.    cx;    .;c;,,;:::::::clc:,'',,'...;cc:cc;'',,'..''..,xo..';:coxOKNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXc;:.   ;OO,     '::;,'';::c:::clc:cllodddoolc::cooc;,'..'...'cd;.....''';cdk00KXWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWx::.  ;0Nd.     .;:;,,'',;::::ccc:ccc:::loddddoooc'..........;:'...........',,,;cdOXWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMXo'..lKNk,.    .';:;;;,'.',;:cc:cccc:;,....'''......'........'....................';ok0KXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMNO;.lNMK:    ..:dl:;;;;;,...,;;::cllllc;,''..  ..''''.......'........................';:ldxOKNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMW0o' ,0Nk'    ..:l,,;;;::;,'...',,;clloolllc::,,'.............''.........................',;codxO0XWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWNo..dO;.   .oo:,'';;;::::;,'.....',;::::;,,,,'....  .......''............................'';:cllodxkOKXNWMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWWXko:cxc.    .;'....,:;;::::::;,............         .......'''.................................',;;:::;;:cdkKNWWMMMMMMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKl;xXXx'......'''...,::;;::::;;;;,...             ..........''..............................''.'...........',:ldxkOKXWMMMMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKo,dNMXo..,'.'''','...;:;;;;;;;,,,''...           ........................................'''''''''''...........'',,:ldkKNMMMMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXo,xXkc,''..',,,','...'::;,,;;,,,'...            ......................................'.''''''''''''''''............'',:okKWMMMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKdcdd;'''..',,,,,,,'. .,:;,,,,,,,''...           ........................................''''''''''',,,,,'''..............,;l0WMMMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWKoll:,'''..',,,,,,'','. .';;,''',,''......................................................''''''''',,;;;;,,,,''...............'dXWMMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWXd;,,''''..'''',,,,,,,,'.  .',,'''''...........'''......................................''''',,,,,,,;;;:;;;;;;,,''''.............:ONMMMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMWX0xc,''''''..'''',,,',,'',,,..  ..'''''''........''''''''.........''.....''...........''''''''',;::::;;;:::;;;;;;;,,,,,''.'''.........lKWMMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMMMMWKOdc,''''',,'..',''',,,',,'.',,,,..   ...''''....'',,,;;;,'''''''''''''''..''..'''..'.'''',',,,,,,;::::::;;;:;;,,;;;;,,,,,,'','......... .:0WMMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMMMMWN0d:,''''''''''.';,''',;,'',,'''',,;;,'... .....',;:ccllc:;''''',,,,;;,,,,,''',''',,''''''',,,,,,,,,,;:;;;::;',;;,,,;,,;,,,;,,,,'.............;OWMMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMMMWN0xl:,'...''''''.',;,'',,,,'''',,''.'',,;;,,'.........,;clc;,',,,,,,;;;;;;,,,,,,,,,'',''''''',,;;,,,,,,,;;,,,;:,.';,',,,,,,,,,,;;,'...............,OWMMMMMMMM",
"MMMMMMMMMMMMMMMMMMMMWXko:;;,.....''''.'',;,,,,,,,'''''',,''''',,;;;;,''.......''',,,,,,,,;;;;;;;,,;,,,,,,,,,,''''''',,,,,,,,,,,,,''',;,.',,'''',,',,,;;,'''''.......',....,kNMMMMMMM",
"MMMMMMMMMMMMMMMMMMWXkl;,;,'.....''''''';;;,,;;,,'.',,'',,,,,;,,,'...'',;;;;,,''.',,,,,,,,,,,,;;,,;;,,,,,,,,,,''''''',,,,,,,,',,,,'''','..'''''''''',,;,...''''.......,:,.. 'kWMMMMMM",
"MMMMMMMMMMMMMMMMMW0l;,,,,''''''''''',,,;;;;;;;''',,,''',;;;,'......,;;;:ccc::::;;;;,'',,,,,,,,;,,;,,,,,,,,,,,',,'',,,,,,,,,'',,,,'''','...''.'''''',;,......'''.......,c;...,kWMMMMM",
"MMMMMMMMMMMMMMMMXx:''',,''''''',,,,,,,,,;;;;;,'',,,,'',;;'.....',;;:::::::;::ccc:;'.',,,,,,,,,,,,,,,,,,,,,,,,,,;,,,,,,',,,,,,,,,,'.''''.......''.'',,'.......'''.......':c'..,OWMMMM",
"MMMMMMMMMMMMMMMNd,.'',''''''',,,,,,,,,,,,,,,,,','',,',,'.. ..,;::::::;::;;;:::c:;'.',,,,,,,,,,,,,,,,,',,,,,,,,,,,,,,,,,,,,,'''',,'....'..........','''........'''........;c;..;OWMMM",
"MMMMMMMMMMMMMMM0:.''''''''',,,'','''''''''',,,,..',,,'..  .';::::::;;;;,,;::::;,'.',,,,,,,,,,,,,,,,,''',,,,''',,,,,,',,,,,,,',',,'..'.... ...........''........''''.......,c:'.:0WMM",
"MMMMMMMMMMMMMMMO;';,''''''''',',,'.''''''',,;,..',;,..  ..,::::;;:;;;,,,;::;:;'.',,,,',,',,,,,',,,,,''',,,''''',,,,,,,,,,,,,,,',,'....... ...........',.........'''''......';:,.cKWM",
"MMMMMMMMMMMMMMMk,';'''''''''''''''.''''..';;'..';;'.  ..,::::;;;;;;,',;:::;;,..';;,',,,,'''','''',,,''',,,''''',',,,,,,,,,,,,,,',,.......  ........ .',.. ........''',;'.....,::,oXM",
"MMMMMMMMMMMMMMMk'...'''''''''''''..''''.',;'..';;..  .';::;;;;;;;;'',::::;;,..',,,,'',,,,'''''''',,,''''',::::cccc:;;:clc:;;:;',,,........ .......  .','.. ........'..,:;.....':lcxN",
"MMMMMMMMMMMMMMMO,....'''..'.''''...''...,;,...;'.  .';:::::;;;;;,'.,;;;;;;,..',''''',,,,''''''''',,,,'',''l0XKOlo0KOxxxxkxdxx:',;,........  ......  ..,,..  ...........':c,.....:od0",
"MMMMMMMMMMMMMMMO,.....''''''''''....''',,'...,.   .,:;;::;;:;;;,..',,;;;;,...''''''',,,''''''''''',,,,,,,';xxdo:cddkxxkxkxxxl'',;,........  ......  ..',..  ............':l:,....;dk",
"MMMMMMMMMMMMMMM0;.......''''''''.....',,....'.  .,;::::;,;;;;;'..',,;;;;,...''...''',,''''.'''''''',,,,,,';xkxo:cddxxxxxkxddc'',,'.........  .....   ..,'.   ........'''..,cc;'...,l",
"MMMMMMMMMMMMMMMXc........'''''''....','....'.  .,::;::;;;;;;;'...',;;;;,.........'',,,'''..''''''''',,,,,,o0KKkclOKOxdddxxxxo,',,'.........   ....   ..''.    .......''''..':l:,...,",
"MMMMMMMMMMMMMMMNo..........''''....''.. .'.. .';::;::;,;;;;,...'';;,;;'..........',,,,'''''''''''''',,,',dKKKK0dokxdOd:d0000Kx;''...........  ....    ..,..   ..........''...;cc:'..",
"MMMMMMMMMMMMMMMWx'..........'''....'....,.  .';::;;;,,;;;;'...',;;;,,'...''.....'',,,,'''''''''''''''''',ddodoooodlcoocoddddkx;... .........   ...     .'..   ..........'''...,:cc,.",
"MMMMMMMMMMMMMMMMO;...........','.......,.  .,;:;;;,',;;;,.....',,,,,'...'''.....',,,,,'..'''',,,'''''''',ll::;;::ldddc::;;::ol'... .........   ....    .''.   ........ ..'''...':ll:",
"MMMMMMMMMMMMMMMMKc.'..........''...'....  .,;;;;;,',;;;'...''',,,,,...''''.....'',,,,''..'''',,,''''''''.:oc:;;:ck0O0d::;::ld:...  .........    ...    ..'.     .......  ..'''..,;:c",
"MMMMMMMMMMMMMMMMNo''..........''..''......,;;;;,',,;,,,,:c:,',,,,'...''''......',,,,,''..'''',,,,,''.'''.':ll::::coxdc::::oo:'..  ...........    ...    .'.     ........  ..,,''..';",
"MMMMMMMMMMMMMMMMNd,'..........''..''.....',;;,,,,;;:looc;'..',,,'...'''''......',,,,''...''',,,,,,''''','.',:cccc::cccclcc:,'...  ...........    ...    ....    .............'''...'",
"MMMMMMMMMMMMMMMMWk;'...........'.',.....',;oc',;:oxOxc.....,,,,'...'''''......',,,,,'...''',,,,,,,,'''','..'''''',:c;,,,,'''.... ............     ...   ....    ..............'''...",
"MMMMMMMMMMMMMMMMWk;.....  .....'''.....',,:xxlok00kl'...',,;,,'...'',,,'.....'',,,,,'....'',,,,,,,,,'''''''..',''..'',,,,'....................     ..    ...    ................''..",
"MMMMMMMMMMMMMMMMWO;....   ........  .'','';dO0KOo:,....,,;,,,....''',,,'......','',''...'''','',,,,,,''''''....','..'''''''...................      .    ...    .................'..",
"MMMMMMMMMMMMMMMMWO;...     ......   .',.. .;ll:'.'...';:;,,'....',,,,,'.......','',''...'''''''',,,,,''''''''...',''...'''....................       .   ....   ....................",
"MMMMMMMMMMMMMMMMWO,....    .....     ..   ...  .''...;;;,,,....',,,;,'.......'','',''....''''''',,,,,'''''''''....','..........................           ...    ............. .....",
"MMMMMMMMMMMMMMMMWk'...     ......     .   ..  .,'...;;,',,....',,,,,,........'''',,'.......'''''',,,,'''''''''.....',''.........................          ...    ...................",
"MMMMMMMMMMMMMMMMNd...    ........         .....,...,;'.',....,,,,;,,'........'''',,'....''''''''',,,,'''.............','........................          ....   ...............  ..",
"MMMMMMMMMMMMMMMWO;...      ......          ...,...,,...,...,;;,,;;,'.........'''','......''..'''''',,,'................','.......................          ...   ...................",
"MMMMMMMMMMMMMMMXo....      .......      .  ..,'...,...'...,;'',;;;,.........''''','..........';cl:,''''....';cllllc;.....'''......................         ....  .................. ",
"MMMMMMMMMMMMMMMKc....      .......      ..  .,. .'. .'...,,..,;:;,..........'',''''.....''...:k0ko,'',;,.,coxkOO0Okkd:'..,'.......................         ....  .................  ",
"MMMMMMMMMMMMMMM0:...       ........      .  ... ..  ....,'..';;;,.;xOl......',,',''.......'..cOx,''',oxc:x000Oxxddooddd::dc'.......................         ...  ............       ",
"MMMMMMMMMMMMMMWO,...       ......            ..... ...',....,;;,'.'cl;......',''''.,;:::,'..;o0Ol;''o0Odld0KKKklodxxOklloxOl'......................         ... ..  .........       ",
"MMMMMMMMMMMMMMWx'..        ......             ......','.  .',;,... .;;...,lxkko,':xkkxxOOxo:cx00kc';x0kdxOKK0kc:k0KKKKOxodOx;......................         ... ..   ..    ..       ",
"MMMMMMMMMMMMMMWd'..        ......              .....'...'.'lkOko;..lK0;.:0Kkox0lcKKl,'';xXX0:'o0l..;k0kx0KXOc',dKKKKKKKOdxOkc......................          .. ..      ............",
"MMMMMMMMMMMMMMNo..         ......               .cl,...;OdcxxoxKKo.;0Xc,kXd,';cckNOlclooxKXXd'c0x'..o0OkkKXKxlllxKKK0OkxxkOx,..........................       ....       ..         ",
"MMMMMMMMMMMMMMNo....     .....                  .l0d....dOdl;..lKO,'ONo:0Xo,''.,kX0xoollllll;':0O;..;xOOkkOkdoddxKKKkooxkOxc.................   .  .....       ...      .....       ",
"MMMMMMMMMMMMMMWd....         ....               ..dKl...;OOc,..'kKl,xNx:OXo'';l:oXKc....;dkxc.;k0c...;x0Okkxodk000OkxkkxOkc................        ...,.       ...     .......     .",
"MMMMMMMMMMMMMMWx....        ...                 ..'dO:...o0l'. .dXk;oXk:xXO:,d0c'oK0dlcokK0x;.,x0l....;ldkO0kdooooookOkdl;.................        ...,'       ....    ........   ..",
"MMMMMMMMMMMMMMWx'....    .                      ...'x0l..c0d.  .lX0coXO;;xK0OOl...;lddddl:,'.',::,......':clloxxoxkolc:,...................         ..''.      ....    .............",
"MMMMMMMMMMMMMMXd'.....           .               ....o0Oxk0o.   'cc;:oc;,;:lc;..............''''''......''''':c;',c;.........................  ..    ..'.       ....     ..........'",
"MMMMMMMMMMMMMWk,  .....                 .        .'...':c:,'.   ...,,,,,,,,,''..............'''''''......'''''''''...........................         .....      ...     ..........'",
"MMMMMMMMMMMMMNo.   ....      ...       ..       .lx:......'..  ...',,,,'',,,'.............'''''''.'''......'''''''............................        .....       ...    ..........'",
"MMMMMMMMMMMMMXo'.......         ... ..... .     'kNk,........  ..'''''''',,,..............''''''''''''.....'''''''''...........................       ....         ..     .........'",
"MMMMMMMMMMMMMWXd,'....          ............ .  ,OMNo.......   ..','''''',,'.............'''''''''''''......''''''''..............................    ...         .,...   ........',",
"MMMMMMMMMMMMMWNXd,''..         ................ .lXWO;......  ...'''..'',,,'............''''',''''''''.......'''''''''''..................................        .cl...  ........',",
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
    System.out.println("                                                                    ######  ####### #######   ######  #          #    #     # ");
    System.out.println("                                                                    #     # #          #      #     # #         # #    #   #  ");
    System.out.println("                                                                    #     # #          #      #     # #        #   #    # #   ");
    System.out.println("                                                                    ######  #####      #      ######  #       #     #    #    ");
    System.out.println("                                                                    #     # #          #      #       #       #######    #    ");
    System.out.println("                                                                    #     # #          #      #       #       #     #    #    ");
    System.out.println("                                                                    ######  #######    #      #       ####### #     #    #    ");

}
}
