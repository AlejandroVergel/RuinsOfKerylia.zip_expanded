package Controlador;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class RuinasDeKerylia {
			
	
	
	
	//⛖⛖⛖⛖⛖⛖⛖⛖REGION⛖⛖⛖⛖⛖⛖⛖⛖VARIABLES ESTATICAS⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖
	//region
	static String noSel ="Not Selected";
	
	static String name = noSel, race = noSel, archetype = noSel, territory = noSel, avatar = noSel; //Se le da un valor inicial nulo para que siempre tenga un valor "seguro"
	static String decision, bigDecision; //Decision Text
	static String head = noSel, body = noSel, weapon = noSel, rangeweapon = noSel;
	
	//Habilidades	
	static int strength = 0, agility = 0, perception = 0, subtlety = 0, willpower = 0, charisma = 0, knowledge = 0, magic = 0;
	
	//Dinero/Griales	
	static int grails = 0, earnedGrials = 0;
	
	static int points = 0;
	
	static Scanner sc = new Scanner(System.in);
	
	static boolean talkedVarek = false, ghorakFootprints = false, mirkasCabinInvestigated;
	
		//⛖⛖⛖⛖⛖⛖⛖⛖FIN DE REGION⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖
	//endregion
	
	static void earned () {
		if (earnedGrials >=10) {
			earnedGrials -= 10;
			points ++;
		}
	}
	
	static void nonCode () {
		System.out.println("Not Coded Yet");
	}
	
	//@@@@@@@@@@@@@PESTEÑA@@@@@@@@@@@@@INVENTARIO
	static void mostrarInventario (Scanner sc) {
		System.out.println(" =============================");
		System.out.println(">>>       Inventario        <<<");
		System.out.println(" =============================");
		System.out.println();
		System.out.println("Nombre: " + name);
		System.out.println("Griales: " + grails);
		System.out.println("Clase: " + archetype);
		System.out.println("Raza: " + race);
		System.out.println("Avatar:");
		System.out.println(avatar);
		
		System.out.println();
		System.out.println("Cabeza: ");
		System.out.println(head);
		
		System.out.println();
		System.out.println("Cuerpo: ");
		System.out.println(body);
		
		System.out.println();
		System.out.println("Arma: ");
		System.out.println(weapon);
		
		System.out.println();
		System.out.println("Arma a distancia: ");
		System.out.println(rangeweapon);
		//Characters 64 Contrast 200
		
		System.out.println("Pulsa ENTER para volver");
		
	}
		
	static void mostrarHabilidades (Scanner sc) {
		System.out.println("Fuerza = " + strength);
		System.out.println("Agilidad = " + agility);
		System.out.println("Percepcion = " + perception);
		System.out.println("Sutileza = " + subtlety);
		System.out.println("Voluntad = " + willpower);
		System.out.println("Carisma = " + charisma);
		System.out.println("Conocimiento = " + knowledge);
		System.out.println("Magia = " + magic);
		
		System.out.println();
		
		if (points !=0) {
			System.out.println("Tienes " + points);
			if (points !=1) {
				System.out.println(" puntos ");
			}
			else {
				System.out.println(" punto ");
			}
			System.out.println("de habilidad disponible ¿Quieres gastar 1 (S)? ¿O volver al juego? (N)");
			String input = sc.nextLine();
			if (input.equalsIgnoreCase("S")) {
				System.out.println("¿A que habilidad quieres sumarle 1 punto?");
				System.out.println("""
						1) Fuerza
						2) Agilidad
						3) Percepcion
						4) Sutileza
						5) Voluntad
						6) Carisma
						7) Conocimiento
						8) Magia
						""");
				
				decision = leerEntrada(sc);
				
				//Switch puntos de habilidad
				switch (decision) {
					case "1" :
						strength ++;
						System.out.println("Puntuacion añadida.");
						System.out.println("Fuerza = " + strength);
						points --;
						break;
					case "2" :
						agility ++;
						System.out.println("Puntuacion añadida.");
						System.out.println("Agilidad = " + agility);
						points --;
						break;
					case "3" :
						perception ++;
						System.out.println("Puntuacion añadida.");
						System.out.println("Percepcion = " + perception);
						points --;
						break;
					case "4" :
						subtlety ++;
						System.out.println("Puntuacion añadida.");
						System.out.println("Sutileza = " + subtlety);
						points --;
						break;		
					case "5" :
						willpower ++;
						System.out.println("Puntuacion añadida.");
						System.out.println("Voluntad = " + willpower);
						points --;
						break;	
					case "6" :
						charisma ++;
						System.out.println("Puntuacion añadida.");
						System.out.println("Carisma = " + charisma);
						points --;
						break;
					case "7" :
						knowledge ++;
						System.out.println("Puntuacion añadida.");
						System.out.println("Conocimiento = " + knowledge);
						points --;
						break;
					case "8" :
						magic ++;
						System.out.println("Puntuacion añadida.");
						System.out.println("Magia = " + magic);
						points --;
						break;
					default: //Es el "else" de switch
						System.out.println("Opcion no valida, intentalo de nuevo.");
				
				}
			}
			System.out.println("Pulsa ENTER para volver al juego");
		}
	}
	
	//@@@@@@@@@@@@@PESTEÑA@@@@@@@@@@@@@LEERENTRADA
	static String leerEntrada(Scanner sc) { //Cada vez que vaya a poner un sc.nextLine(); pogno un leerEntrada(sc); ya que sirve para lo mismo pero en este caso tambien puede leer "inventario"
		String input = sc.nextLine();
		if (input.equalsIgnoreCase("inventario")) {
			mostrarInventario(sc);
			return leerEntrada(sc);
		}
		else if (input.equalsIgnoreCase("habilidades")) {
			mostrarHabilidades(sc);
			return leerEntrada(sc);
		}
		return input;
	}
	
	static void decision0(){
		System.out.print("""
				Despierta
				El frío de la madrugada cala los huesos antes que el sol toque las murallas de Aurikaan.
				El aire huele a tierra húmeda, a paja quemada y a pan mal cocido.
				Eres uno más entre los cientos de campesinos que trabajan los campos del Valle de Brion,
				tierras que alimentan a la gran ciudad pero apenas a quienes las cultivan.
				""" + "Te llaman "+ name + ", un " + race);		
		switch (race) {
			case "Taren" :
				System.out.println("""					
						 de piel marcada por las luces de la Ruptura, aunque aquí, 
						entre barro y callos, esos destellos no valen más que una moneda oxidada.
						""");
			break;			
			case "Drakien":
				System.out.println("""					
						 de escamas veladas y sangre que recuerda al fuego antiguo.
						Aquí, donde el orgullo se arrodilla ante el hambre, 
						tus ojos de dragón apenas sirven para espantar cuervos.
						""");
			break;			
			case "Nimrai" :
				System.out.println("""					
						 de mirada líquida y piel que refleja la luz como un río al amanecer.
						Aquí, lejos del mar que canta su nombre, tu linaje apenas vale lo que una gota en el barro.
						""");
			break;			
			case "Ghorak":
				System.out.println("""					
						 de piel ceniza y mirada forjada en guerras antiguas.
						Entre estos campos dóciles, tu fuerza solo inspira temor, 
						y tus manos valen menos que la bestia que labra la tierra.
						""");
			break;			
			case "Veylan":
				System.out.println("""					
						 de ojos oscuros y voz que susurra donde otros callan.
						Los aldeanos evitan tu sombra, temen que tus palabras despierten 
						los ecos de la Ruptura que aún sangran bajo el cielo.
						""");
			break;
			
		}
		
		System.out.println("""
				Te levantas de tu catre de pino, los dedos entumecidos por el rocío. 
				Tu choza es pequeña: una mesa coja, una jarra de agua casi vacía, 
				y una ventana rota que deja entrar el aliento helado del amanecer.
				""");
		
		System.out.println("");
		do {
			System.out.println("¿Que haces?");
			
			System.out.println("");
			
			System.out.println("""
					1) Revisar tus pertenencias.
					2) Observar por la ventana.
					3) Salir directamente.
					""");
			
			decision = leerEntrada(sc);
			switch (decision) {
			case "1":
				System.out.println("""
						Rebuscas bajo el catre y entre los tablones sueltos de la mesa.
						
						No hay mucho, pero cada pequeño hallazgo importa:
											
						Un trozo de cuerda deshilachada, útil para improvisar herramientas.					
						Una aguja de hueso, puede servir como ganzúa rudimentaria o para coser.					
						Una orbe de griales de poco valor, pero suficiente para tentar a alguien desesperado.
						""");
			break;
			case "2":
				System.out.println("""
						Te acercas a la ventana rota, apartando con cuidado las astillas que aún cuelgan del marco.
						La niebla cubre los campos, pero entre la bruma distingues siluetas moviéndose junto al viejo pozo.					
						Una figura grande, más robusta que un campesino común, parece inclinarse sobre el brocal.					
						Luego se pierde en la penumbra, dejando solo huellas húmedas que se desvanecen en la tierra.
						""");
			break;
			case "3":
				System.out.println("""
						Sales de tu casa y te diriges al poblado.
						""");				
				System.out.println("""
						El capataz Orven, un Taren curtido por el sol, llama a todos para la reunión matutina.
						Os esperan en la plaza de la aldea.
						Antes de unirte	puedes deambular por la aldea.
						""");
				decision1();
			break;
			}
		}while (!(decision == "3"));
		
		
	} //Terminada
	
	static void decision1() {
		
		
		System.out.println("");
		
		System.out.println("¿A donde vas?");
		
		System.out.println("");
		
		System.out.println("""
				1) Ir directamente a la reunion.
				2) Investigar el pozo.
				3) Ir a casa de la anciana Mirka.
				4) Ir al establo de Varek.
				""");
		
		decision = leerEntrada(sc);
		
		switch (decision) {
		case "1":
			System.out.println("""
					Decides no invenstigar e ir a la reunion para no perder el tiempo.
					""");
			decision2();
		break;
		case "2":
			System.out.println("""
					Sales y te acercas al pozo de agua, al borde del patio. 
					El sol se refleja en la piedra húmeda, y notas que las cuerdas están gastadas, 
					como si alguien hubiese sacado más agua de la normal en los últimos días.
					""");
			decision1_1();
		break;
		case "3":
			System.out.println("""
					Todo el mundo en la aldea sabe de la anciana Mirka, algunos creen en su saviduria y otros creen que solo esta loca.
					Sigues el camino hasta una cabaña al borde.
					El techo está hundido en algunas partes, pero la puerta está decorada con símbolos tallados en madera: 
					círculos entrelazados y líneas torcidas que recuerdan a las grietas del cielo.
					La puerta esta abierta, a Mirka nunca le molestaron las visitas.
					Dentro, el aire huele a hierbas secas y humo. Mirka, la anciana, se mece en una silla junto al fuego. 
					Sus ojos parecen perderse más allá de las llamas, como si viera un mundo que los demás no pueden.
					Sabe que estas ahí.
					""");
			decision1_2();
		break;
		case "4" :
			System.out.println("""
					
					""");
			nonCode();
		break;
		}
	}
	
	static void decision1_1() {
		
		System.out.println();
		
		System.out.println("¿Que haces?");
		do {
			System.out.println();
			
			System.out.println("""
					1) Investigar el exterior del pozo
					2) Investigar el interior del pozo
					3) Marcharte
					""");
			
			decision = leerEntrada(sc);
			
			switch (decision) {
				case "1":
					System.out.println("""	
							En el suelo, junto al brocal, algo llama tu atención:
							Unas huellas húmedas, demasiado grandes para ser de un campesino común, 
							y un trozo de tela azul enganchado en la piedra.				
							""");
					if(race == "Ghorak") {
						System.out.println("""	
								Reconoces que las huellas son de uno de los tuyos, 
								de otro Ghorak, es muy raro ver a otro como tu aqui.				
								""");
					}
					else {
						System.out.println("""
								Sospechas que las huellas puedan pertenecer a un Ghorak, 
								pero es muy raro verlos por aqui en Aurikaan.					
								""");
					}
					
					System.out.println("""	
							No sabes que es esa tela, pero no tiene pinta de ser solo basura, 
							por si acaso lo cojes y te lo quedas.				
							""");
				break;
				case "2":
					System.out.println("""
							Ves agua agitada, pero no por el viento. 
							Notas un eco extraño en las paredes, como si algo respirara debajo.
							+1 de percepcion.				
							""");
					perception =+ 1;
				break;
				case "3":
					System.out.println("""
							Tomas un poco de agua del pozo y te vuelves a casa.
							""");
					decision1();
				break;
			}
		
		}while (decision != "3");
	} 
	
	static void decision1_2() {
		System.out.println("""
				Mirka: '¿Que necesitas?'
				""");
		do {
			System.out.println();
			
			System.out.println("¿Que le dices?");
			
			System.out.println();
			
			System.out.println("""
					1) Preguntar por sus rezos
					2) Marcharte
					""");
			if (talkedVarek || ghorakFootprints) {
				System.out.println("3) Preguntar por los Ghorak");
			}
			
			if (mirkasCabinInvestigated) {
				System.out.println("4) Investigar cabaña");
			}
			
			decision = leerEntrada(sc);
			
			switch (decision) {
				case "1":
					System.out.println("""	
							Tu: '¿Qué reza, anciana?'

							Mirka: 'No rezo por mí, sino por todos.
							Las cicatrices del cielo siguen abiertas, aunque vosotros hayáis aprendido a ignorarlas.
							La Ruptura nunca duerme del todo.'				
							""");
					/*if ( PAÑO AZUL) {
						System.out.println("""	
								Mirka: 'Ese paño… entonces aún queda quien recuerda.
								Escucha, joven: Lunagreka. Guárdala en tu memoria. 
								Algún día, esa palabra abrirá o cerrará puertas.'			
								""");
					}*/
				break;
				case "2":
					System.out.println("""
							Ya no quieres seguir ahí, tal vez tienes lo que querias, 
							o simplemente te arrepentiste de venir, pero sea como sea, te marchas.					
							""");
					decision2();
				break;
				case "3":
					if (race == "Ghorak") {
						System.out.println("""
								Tu: '¿Sabes algo sobre mas Ghoraks viniendo por esta zona? No es normal ver a mas como yo aqui.'

								Mirka: 'Tienes razon, ya solo verte a ti y al joven del establo es insolito, pero sí, los ghorak cruzan los pasos. 
								Huyen de montañas que ya no son suyas. No es el hambre lo que los expulsa, sino el susurro de lo que duerme bajo Xor-Kharr.
								Nadie abandona un hogar si no es porque la sombra ya vive dentro.'
								""");
					}
					else {
						System.out.println("""
								Tu: '¿Sabes algo sobre Ghoraks por esta zona? no es normal verlos por aqui.'

								Mirka: 'Sí… los ghorak cruzan los pasos. Huyen de montañas que ya no son suyas.
								No es el hambre lo que los expulsa, sino el susurro de lo que duerme bajo Xor-Kharr.
								Nadie abandona un hogar si no es porque la sombra ya vive dentro.'
								""");
					}
				break;
				case "4" :
					mirkasCabinInvestigated = false;						
					if (perception < 4) {
						System.out.println("""
								Usas percepcion.
								
								Mientras te hacercas a Mirka, dejas que tu mirada se deslice por la habitación.
								La cabaña es pobre, pero no descuidada: haces de hierbas secas cuelgan del techo, 
								y en las paredes se distinguen símbolos tallados con paciencia en la madera. 
								Al principio parecen dibujos sin sentido… pero no crees que verdaderamente lo sean.
								Tus ojos se fijan casi instintivamente en un simbolo en espiral con una grieta central, 
								tal vez sirva para algo recordarlo.
								No consigues ver nada mas en la cabaña.
								+1 de percepcion.
								""");
						perception =+ 1;
					}
					else {
						System.out.println("""
								Intentas usar percepcion, pero no tienes suficiente.
								
								Mientras te hacercas a Mirka, dejas que tu mirada se deslice por la habitación.
								La cabaña es pobre, pero no descuidada: haces de hierbas secas cuelgan del techo, 
								y en las paredes se distinguen símbolos tallados con paciencia en la madera. 
								Al principio parecen dibujos sin sentido… y aunque no creas que lo sean, no comprendes que son.
								""");
					}
				break;
			}
		}while (decision != "2");
		
	}
	
	static void decision2() {
		
		System.out.println("""
				El capataz os lo cuenta tras reuniros todos, hoy no es un día cualquiera: 
				Se celebra la Asamblea de los Mercados, una reunión en la que el Consejo de Aurikaan decide si abrirá las puertas a los refugiados de Xor-Kharr.  
				Para la mayoría es solo política de los ricos… pero podría ser una oportunidad. 
				Dicen que la ciudad busca nuevos ojos y oídos para vigilar a los extranjeros.
				Necesitan a gente que se una a las filas por si la situacion se tuerce.
				""");
		
		System.out.println("");
		
		System.out.println("¿Que vas a hacer?");
		
		System.out.println("");
		
		System.out.println("""
				1) Aceptar unirte.
				2) Ofrecerte como vigia.
				3) Negarte.
				4) Pensartelo.
				""");
		
		decision = leerEntrada(sc);
		
		switch (decision) {
		case "1":
			System.out.println("""
					Te unes a la fila. Te vuelves simplemente uno mas entre los campesinos que suben al carromato.
					""");
			decision3_a();
		break;
		case "2":
			System.out.println("""
					Te adelantas y le dices al capataz que prefieres observar desde la distancia, observando en caso de que algo vaya mal avisar a la ciudad, 
					no es algo muy heroico pero haces algo distinto al resto de campesino, el capataz ahora sabe quien eres.
					Ganas reputacion de trabajador confiable.
					""");
			nonCode();
		break;
		case "3":
			System.out.println("""
					La asamblea no va contigo y no te interesa esta al frente de un posible conflicto, le dices al capataz que tu no iras ahí, 
					el capataz te mira mal, pero es decision tuya, a cambio tendras que quedarte vijilando la armeria.
					Para el capataz te has ganado la reputaion de poco fiable, pero no es el unico para el que has destacado.
					""");
			nonCode();
		break;
		case "4" :
			System.out.println("""
					Aun no te atreves a tomar la decision asi que le dices al capataz en que te deje un momento para pensarlo, 
					el capataz se acerca con ira hacia a ti y te agarra del brazo:

					Capataz Orven: '!No tenemos tiempo, coge un arma y preparate para lo peor o apartate de en medio pero no nos retrases¡'
					
					Te empuja al suelo frente a todos, no era lo que querias pero te has ganado la reputacion de cobarde, 
					no tiene pinta de que vayan a olvidarse de tu cara, y menos el capataz, ahora te obliga a elegir, 
					sube al carromato o quedate vigilando la armeria.
					""");
			nonCode();
		break;
		}
		
	}
	
	static void decision3_a() {
		System.out.println("""
				Un carromato cargado de grano os lleva a varios campesinos hacia las puertas de Aurikaan.
				El traqueteo de las ruedas acompaña rumores:

				Escuchas sobre refugiados ghorak cruzando los pasos del norte, otros rumorean sobre un mercado negro que prospera 
				dentro de los muros y luego hay una anciana solitaria, habla muy vajo para escucharla pero se nota que es algun tipo de rezo.
				
				Estais apunto de llegar pero te da tiempo ha hacer alguna pregunta.
				""");
		
		System.out.println("");
		
		System.out.println("¿Que vas a preguntar?");
		
		System.out.println("");
		
		System.out.println("""
				1) Sobre los refugiados.
				2) Sobre el mercado negro.
				3) Preguntar a la anciana.
				4) No preguntar nada.
				""");
		
		decision = leerEntrada(sc);
		
		switch (decision) {
		case "1":
			System.out.println("""
					Te fijas en un jornalero al que habias escuchado murmurar sobre los refujiados pero, te das cuenta de que es mas grande de lo normal, 
					su piel es levemente grsacea y su pelo de un rojo muy intenso, parece obio que no es un taren completo, 
					talvez en gran parte pero desde luego tiene sangre ghorak, le preguntas sobre los rumores de refujiados en el norte:

					Jornalero: 'Los rumores son ciertos, algunos ghoraks estan cruzando los pasos del norte. 
					Demasiados, si preguntas a los nobles. Las minas de Xor-Kharr se han vuelto… imposibles.
					Algunos dicen que las grietas del cielo están creciendo allí. Otros, que los humanos los cazan por deporte.
					Se que ningun ghorak abandona su hogar sin una buena razón.'
					
					Mientras habla ves como aprieta los puños y escuchas su piel crujir.
					""");
			//Si hablaste con varek y si no hablaste con varek
			nonCode();
		break;
		case "2":
			System.out.println("""
					Te inclinas hacia el joven mercader, un chico de rostro pálido y manos nerviosas, se mueve inquieto en el carromato, 
					como si cada bache fuera una amenaza.
					Su bolsa de especias emite un aroma cálido a canela y hierro, y sus dedos, finos y manchados de polvo,
					no dejan de rozar el cordón del cierre.

					Tu: 'Dicen que el mercado negro prospera dentro de los muros. ¿Has oído algo?'
					
					Mercader: 'Shhh… no digas eso tan alto, osea, no, no existe, bueno, depende de quien pregunte'
					
					Ves que obiamente oculta algo, puedes intentar persuadirlo para que te lo cuente, o dejarlo en paz.
					""");
			//decision3_a_1();
			nonCode();
		break;
		case "3":
			System.out.println("""
					""");
			nonCode();
		break;
		case "4" :
			System.out.println("""
					""");
			nonCode();
		break;
		}
	}
	
	/* 
	static void decisionPlantilla() {
		System.out.println("""
				""");
		
		System.out.println();
		
		System.out.println("¿Que vas a preguntar?");
		
		System.out.println();
		
		System.out.println("""
				1)
				2)
				3)
				4)
				""");
		
		decision = leerEntrada(sc);
		
		switch (decision) {
			case "1":
				System.out.println("""					
						""");
				nonCode();
			break;
			case "2":
				System.out.println("""					
						""");
				nonCode();
			break;
			case "3":
				System.out.println("""
						""");
				nonCode();
			break;
			case "4" :
				System.out.println("""
						""");
				nonCode();
			break;
		}
	} 
	*/
	
	
	
	
	//@@@@@@@@@@@@@PESTEÑA@@@@@@@@@@@@@MAIN
	public static void main(String[] args) {
		
		
		//⛖⛖⛖⛖⛖⛖⛖⛖REGION⛖⛖⛖⛖⛖⛖⛖⛖GRAFICOS⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖
		//region
				
				//  ====================================
				//----------DECLARAR VARIABLES
				//========================================	
				
				//Razas
				String taren, drakien, nimrai, ghorak, veylan;
				
				//Cabeza
				String helmet, hood, hat, headband, naked;//Casco, capucha, gorro (de mago), bandana, desnudo
				
				//Cuerpo
				String armor, rogue ,robe, clothes; //Armadura, ropa de acechador, tunica de mago
				
				//Armas
				String sword, dagger, bow, crossbow, crosier, amulet; //Espada, daga, arco, ballesta, baculo, amuleto
				
				//  ====================================
				//-----------VALORES DE VARIABLES
				//========================================
				
				//  ====================================
				//------------------RAZAS
				//========================================	
				taren = """
						
						""";
				drakien = """
						
						""";
				nimrai = """
						
						""";
				
				ghorak = """
						
					    ██████                             
		                          ███    ███                           
		                         ██   ██   ██                          
		                       ███    ██    ███                        
		                     ██████   ██   ██████                      
		                    ██    ██  ██  ██    ██                     
		                   ██      ███  ███      ██                    
		             ████ █          ████          █ ████              
		             ██   ██                      ██   ██              
		             ██ ██ ██                    ██ ██ ██              
		              ██  ██     ██        ██     ██  ██               
		               ███                          ███                
		                  ████    ████  ████    ████                   
		             ██  █    ████   ████   ████    █  ██              
		          ████ ██   ██                  ██   ██ ████           
		         ██   ███    ███    ██████    ███     ██   ██          
		       ██       █                            █       ██        
		     ██         ███                        ███         ██      
		    ██           ███                      ███           ██     
		  ███             ██                      ██             ███   
		   ██           ███ █                    █████           ███   
		    █████     ███   ████              ████   ███     █████     
		   ██    ███████       ███          ███        ██████    ██    
		  ██         ██          ████████████          ██         ██   
		 ██          ██            █  ██  █            ██          ██  
		███          ██                                ██          ███ 
		█          ████                                ████          █ 
		████████    ████                                ████    ████████
		█       ███ ██ ██                              ██ ██ ███       █
		█         ██   ██ ██                        ██  █   ██         █
		██        ██   ██    ██████████████████████     █   ██        ██
		██         ██ ███          █        █          ███ ██         ██
		█          ████   ██       █        █       ██   ████          █
		██     █ █████       ████  █        █  █████      █████ █     ██
		 ██   ██  █          ███   ██████████  ███          █  ██   ██  
		  █████   █          ████             ███          █     ███   
		         ██          ██ █            █ ██          ██          
		         █          ██   █          █   ██          █          
		        █          ██     ██      ██     ██          █         
		        ██               ██ ██████ ██               ██         
		          █              █          █              █           
		          ██████████    █            █     █████████           
		         ███       ██████             █████       ███          
		        ██             ██             █             ██         
		        ████████████████              ████████████████          
						""";
				veylan = """
						
						""";
				
				//  ====================================
				//------------------CABEZA
				//========================================	
				
				helmet = """
						
					 ████████████               
		          ███     ██     ███            
		         ██                ██           
		        █                    █          
		       █                      █         
		     █████████    ██    █████████       
		     █        ██████████       ██       
		     ██           ██           ██       
		     ██      █                 ██       
		     ██      ██                ██       
		      █ ███████   ██    ██████ █        
		      █  ████████████████████  █        
		      ███  ███████████████   ███        
		      ███ ███  ████████  ███ ███        
		       ██ ███ █        █ ███ ██         
		       ██ ███ █ ██  ██ █ ███ ██         
		       ██ ███ █ ██  ██ █ ███ ██         
		        █████ █ ██  ██ █ █████          
		         ███  █ ██  ██ █  ███           
		           ████ ██  ██ ████             
		             █████  █████               
		                ██████ 
						
						""";
				hood = """
						
						""";
				hat = """
						
						""";
				headband = """
						
						""";
				naked = """
						
						""";
				
				//  ====================================
				//------------------CUERPO
				//========================================
				
				armor = """
						
						""";
				rogue = """
						
						""";
				robe = """
						
						""";
				clothes = """
						
						""";
				
				//  ====================================
				//------------------ARMAS
				//========================================
				
				sword = """
						
						""";
				dagger = """
						
						""";
				bow = """
						
						""";
				crossbow = """
						
						""";
				crosier = """
						
						""";
				amulet = """
						
						""";
				
				
			//⛖⛖⛖⛖⛖⛖⛖⛖FIN DE REGION⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖
		//endregion
		
		
				
		//⛖⛖⛖⛖⛖⛖⛖⛖REGION⛖⛖⛖⛖⛖⛖⛖⛖START MENU⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖
		//region
			//  ====================================
			//------------------START MENU
			//========================================	
			
			//"Menuo" de inicio 		
			System.out.println("Bienvenido a 'Ruinas de Kerylia'.");
			System.out.println();
			System.out.println("Las decisiones simples saldran con S/N para SI o NO.");
			System.out.println();
			System.out.println("Las decisiones complejas saldran con numero (1, 2, 3, 4, ...).");
			System.out.println();
			System.out.println("Deberas pulsar ENTER tras escribir el valor que elijas.");
			System.out.println();
			System.out.println("A veces te saldra la opcion de 'Otro' en la que podras escribir manualmente ");
			System.out.println("otra opcion que no venga predeterminada.");
			System.out.println();
			System.out.println(" =============================");
			System.out.println(">>> PULSE ENTER PARA EMPEZAR <<<");
			System.out.println(" =============================");
			System.out.println();
			
			leerEntrada(sc);
			
		//endregion

		
		
		//⛖⛖⛖⛖⛖⛖⛖⛖REGION⛖⛖⛖⛖⛖⛖⛖⛖LORE Y NOMBRE⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖
		//region
			//  ====================================
			//--------LORE INICIAL Y NOMBRE
			//========================================	
			
			//Preguntas simples al jugador
			
			System.out.println("¡Prosperos dias jugador! ¿Como te llamas? ");
			name = leerEntrada(sc);	
			System.out.println("¡Un placer " + name + "!" + " ¿Quieres escuchar la historia del mundo de Kerylia? S/N");
			
			decision = leerEntrada(sc);
			
			if (decision.equalsIgnoreCase("S")) {
				System.out.println("Mucho texto");
				System.out.println();
				System.out.println("> PULSE ENTER PARA CONTINUAR <");
				leerEntrada(sc);
				
			}
			else if (decision.equalsIgnoreCase("N")) {
				System.out.println("Que bago eres");
			}
		
				//⛖⛖⛖⛖⛖⛖⛖⛖FIN DE REGION⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖
		//endregion

				
		
		//⛖⛖⛖⛖⛖⛖⛖⛖REGION⛖⛖⛖⛖⛖⛖⛖⛖PERSONALIZACION⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖
		//region
		
		//  ====================================
		//------------PERSONALIZACION
		//========================================	
		
		//Inicio de la aventura / Personalizacion
		System.out.println("""
				
				Y ahora empecemos con la aventura.
				¿Por que no empiezas contandonos como es tu personaje?
				Dinos, de que raza quieres que sea?
				""");
		//@@@@@@@@@@@@@PESTEÑA@@@@@@@@@@@@@PERSONALIZACION
		do {
				
			
			
			//@@@@@@@@@@@@@PESTEÑA@@@@@@@@@@@@@RAZA
			do {
				
				System.out.println("""					
						Selecciona el numero de la raza que eligas, veras el contexto y los
						pros y contras de cada una.
						1) Taren
						2) Drakien
						3) Nimrai
						4) Ghorak
						5) Veylan
						""");
				
				decision = leerEntrada(sc);
				
				//Switch raza
				switch (decision) {
					case "1" :
						System.out.println("""
								Humanos, pero con ligeras marcas lumínicas en la piel (secuelas de la Ruptura).
								Versátiles, pueden ser diplomáticos o conquistadores.
								""");
						avatar = taren;
						race = "Taren";
						break;
					case "2" :
						System.out.println("""
								Descendientes de dragones extinguidos, con escamas parciales y sentidos agudos.
								Orgullosos, obsesionados con demostrar su superioridad.
								""");
						avatar = drakien;
						race = "Drakien";
						break;
					case "3" :
						System.out.println("""							
								Seres de apariencia élfica pero con sangre ligada al océano.
								Su piel cambia de tono según la luz, y muchos pueden manipular agua en pequeña escala.
								""");
						avatar = nimrai;
						race = "Nimrai";
						break;
					case "4" :
						System.out.println("""
								Criaturas robustas de piel grisácea, creadas como soldados en la guerra mágica.
								Tienen fuerza brutal, pero buscan un lugar en un mundo que los ve como armas.
								""");
						avatar = ghorak;
						race = "Ghorak";
						break;
					case "5" :
						System.out.println("""
								Una raza enigmática, de ojos negros y voces hipnóticas.
								Nacieron de la magia misma, y muchos los temen porque recuerdan demasiado a la Ruptura.
								""");
						avatar = veylan;
						race = "Veylan";
						break;
					default: //Es el "else" de switch
						System.out.println("Opcion no valida, intentalo de nuevo.");
						continue; //Hace que vuelva de nuevo a arriba
				
				}
				
				
				System.out.println();
				System.out.println("Quieres ser de esta especie (S)? O seguir mirando (N)?");
				decision = leerEntrada(sc);
				
			}while (!decision.equalsIgnoreCase("S"));		
			
			System.out.println("Perfecto, ahora, de que clase eres?");
			
			//@@@@@@@@@@@@@PESTEÑA@@@@@@@@@@@@@CLASE
			do {
				System.out.println("""					
						Selecciona el numero de la clase que eligas, veras sus cualidades y los
						pros y contras de cada una.
						1) Ragevager
						2) Acechador
						3) Tejedor
						4) Desposeido
						""");
				
				decision = leerEntrada(sc);
				
				//Switch raza
				switch (decision) {
					case "1" :
						System.out.println("""
								Guerreros que han renunciado a la disciplina para abrazar el instinto. 
								Su fuerza proviene de un vínculo primitivo con la Ruptura, 
								que los llena de furia y les permite resistir golpes que matarían a cualquiera. 
								Se dice que cuando un Ragevager entra en trance de batalla, ni el dolor ni el miedo pueden detenerlo.
								
								Fuerza = 8
								
								Agilidad = 5
								
								Percepción = 3
								
								Sutileza = 2
								
								Voluntad = 7
								
								Carisma = 3
								
								Conocimiento = 2
								
								Magia = 1
								""");
						archetype = "Ragevager";	strength = 8;	agility = 5;	perception = 3;	subtlety = 2;	willpower = 7;	charisma = 3;	knowledge = 2;	magic = 1;
						
						break;
					case "2" :
						System.out.println("""
								Sombras en movimiento, los Acechadores viven donde la luz se quiebra. Arqueros silenciosos, 
								ladrones de secretos, exploradores de lo prohibido: dominan el sigilo y la agilidad, 
								convirtiendo cada sombra en una oportunidad mortal. En su mundo, el primer error siempre es el último.
								
								Fuerza = 4
								
								Agilidad = 8
								
								Percepción = 7
								
								Sutileza = 8
								
								Voluntad = 5
								
								Carisma = 5
								
								Conocimiento = 4
								
								Magia = 2
								""");
						archetype = "Acechador";	strength = 4;	agility = 8;	perception = 7;	subtlety = 8;	willpower = 5;	charisma = 4;	knowledge = 4;	magic = 2;
						break;
					case "3" :
						System.out.println("""							
								Maestros de la Ruptura, los Tejedores manipulan los hilos invisibles que conectan la realidad. 
								Cada palabra, cada gesto, es una puntada en el tapiz de la magia. Pueden sanar, destruir o alterar el curso de lo posible… 
								pero cada hechizo deja una marca, un recordatorio de que el poder nunca es gratuito.
								
								Fuerza = 2
								
								Agilidad = 4
								
								Percepción = 5
								
								Sutileza = 4
								
								Voluntad = 6
								
								Carisma = 5
								
								Conocimiento = 8
								
								Magia = 8
								""");
						archetype = "Tejedor";	strength = 2;	agility = 4;	perception = 5;	subtlety = 4;	willpower = 6;	charisma = 5;	knowledge = 8;	magic = 8;
						break;
					case "4" :
						System.out.println("""
								Nacidos sin magia, sin fuerza excepcional ni habilidades notables. 
								Los Desposeidos son la gente común de Kerylia, los que sobreviven a base de ingenio, 
								paciencia y pura voluntad. Muchos los menosprecian… hasta que uno de ellos demuestra que, 
								en un mundo de prodigios, la verdadera resistencia puede ser la más humana de todas.
								
								Fuerza = 0
								
								Agilidad = 0
								
								Percepción = 0
								
								Sutileza = 0
								
								Voluntad = 0
								
								Carisma = 0
								
								Conocimiento = 0
								
								Magia = 0
								""");
						archetype = "Desposeido"; //Se le deja todo a 0
						break;				
					default: //Es el "else" de switch
						System.out.println("Opcion no valida, intentalo de nuevo.");
						continue; //Hace que vuelva de nuevo a arriba
				
				}
				
				
				System.out.println();
				System.out.println("Quieres ser de esta clase (S)? O seguir mirando (N)?");
				decision = leerEntrada(sc);
				
						
						
			}while (!decision.equalsIgnoreCase("S"));
	
			
			
			System.out.println("Bien, ahora elije el territorio en el que empezaras:");
			
			//@@@@@@@@@@@@@PESTEÑA@@@@@@@@@@@@@TERRITORIO
			do {
				System.out.println("""					
						Selecciona el numero del territorio que eligas, veras el contexto y los
						pros y contras de cada uno.
						1) Aurikann
						2) Xor-Kharr
						3) Islas de Lumeris
						4) Ciudadela de Zeyra
						5) Yragath
						""");
				
				decision = leerEntrada(sc);
				
				//Switch raza
				switch (decision) {
					case "1" :
						System.out.println("""
								Un vasto territorio de llanuras y colinas cubiertas de trigo, donde la nobleza vive del esfuerzo de miles de campesinos. 
								Aurikann fue el corazón del antiguo imperio, pero tras siglos de guerras y sequías, su brillo se ha vuelto polvo. 
								Los castillos aún se alzan, pero sus muros esconden corrupción, pobreza y viejas deudas de sangre.
								Los taren dominan el campo y los mercados, aunque los drakien y ghorak son usados como mano de obra o mercenarios.
								""");
						territory = "Aurikann";
						break;
					case "2" :
						System.out.println("""
								Sombras en movimiento, los Acechadores viven donde la luz se quiebra. Arqueros silenciosos, 
								ladrones de secretos, exploradores de lo prohibido: dominan el sigilo y la agilidad, 
								convirtiendo cada sombra en una oportunidad mortal. En su mundo, el primer error siempre es el último.
								""");
						territory = "Xor-Kharr";
						break;
					case "3" :
						System.out.println("""							
								Maestros de la Ruptura, los Tejedores manipulan los hilos invisibles que conectan la realidad. 
								Cada palabra, cada gesto, es una puntada en el tapiz de la magia. Pueden sanar, destruir o alterar el curso de lo posible… 
								pero cada hechizo deja una marca, un recordatorio de que el poder nunca es gratuito.
								""");
						territory = "Islas de Lumeris";
						break;
					case "4" :
						System.out.println("""
								Nacidos sin magia, sin fuerza excepcional ni habilidades notables. 
								Los Desposeidos son la gente común de Kerylia, los que sobreviven a base de ingenio, 
								paciencia y pura voluntad. Muchos los menosprecian… hasta que uno de ellos demuestra que, 
								en un mundo de prodigios, la verdadera resistencia puede ser la más humana de todas.
								""");
						territory = "Ciudadela de Zeyra";
						break;		
					case "5" :
						System.out.println("""
								Nacidos sin magia, sin fuerza excepcional ni habilidades notables. 
								Los Desposeidos son la gente común de Kerylia, los que sobreviven a base de ingenio, 
								paciencia y pura voluntad. Muchos los menosprecian… hasta que uno de ellos demuestra que, 
								en un mundo de prodigios, la verdadera resistencia puede ser la más humana de todas.
								""");
						territory = "Yragath";
						break;	
					default: //Es el "else" de switch
						System.out.println("Opcion no valida, intentalo de nuevo.");
						continue; //Hace que vuelva de nuevo a arriba
				
				}
				
				
				System.out.println();
				System.out.println("Quieres empezar en este territorio (S)? O seguir mirando (N)?");
				decision = leerEntrada(sc);
				
						
						
			}while (!decision.equalsIgnoreCase("S"));
	
			
						
			System.out.println("¡Genial! Si ya hemos terminado entonces esta es la sinopsis de tu personaje: ");
			System.out.println(name + ", un guerrero " + race + " con habilidades de " + archetype + " empezando en");
			System.out.println("el territorio de " + territory + ".");
			System.out.println("");
			System.out.println("Avatar:");
			System.out.println(avatar);
			
			System.out.println();
			System.out.println("Es asi como quieres que sea tu personaje (S)? O quieres volver atras y cabiarlo (N)?");
			System.out.println("Si vuleves a atras tendras que volver a seleccionar raza, clase y territorio.");
			System.out.println("Si continuas empezara la aventura.");
			bigDecision = leerEntrada(sc);
			
			
		}while (!bigDecision.equalsIgnoreCase("S"));
				
			//⛖⛖⛖⛖⛖⛖⛖⛖FIN DE REGION⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖⛖
		//endregion

		if(territory == "Aurikann") {
			decision0();
		}
		
		
		sc.close();
	}

}
