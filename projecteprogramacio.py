from pymongo import MongoClient

url = "mongodb+srv://ibarrios1:IKERAleix1@cluster0.eowlydk.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0"
client = MongoClient(url)
db = client["escola"]
col = db["estudiants"]


def mostrar_tots():
    for alumne in col.find():
        print(alumne)

def mostrar_aprovats():
    print("Estudiants amb alguna nota superior a 5:")

    for alumne in col.find():
        # Obte la llista d'assignatures de l'alumne
        assignatures = alumne.get("assignatures", [])
        for assig in assignatures:
            if assig.get("nota", 0) > 5:
                print(f"Nom: {alumne['nom']}")
                break

def nom_nota():
    for alumne in col.find():
        print(f"\nNom: {alumne['nom']}")
        # Obte la llista d'assignatures de l'alumne
        assignatures = alumne.get("assignatures", [])
        # Si l'alumne te assignatures recorrem aquestes assignetures i les mostrem en forma de nom i nota
        if assignatures:
            for assig in assignatures:
                print(f"{assig['nom']}: {assig['nota']}")

        # Serveix per poder buscar dins del MongoDB alguna cosa que es digui nota
        elif "nota" in alumne:
            print(f"Nota: {alumne['nota']}")
        else:
            print("No hi ha notes disponibles.")

def afegir_alumne():
    nom = input("Nom: ")
    edat = int(input("Edat: "))
    cicle = input("Cicle: ")
    curs = int(input("Curs: "))
    repetidor = input("És repetidor? (sí/no): ").lower() == "sí"

    # Afegim assignatures (nom i nota)
    assignatures = []
    assig = int(input("Quantes assignatures vols afegir? "))
    for _ in range(assig):
        nom_assig = input("Nom assignatura: ")
        nota = float(input("Nota: "))
        assignatures.append({"nom": nom_assig, "nota": nota})

    tutor = input("Nom del tutor: ")
    horari = input("Horari de tutoria: ")

    nou_alumne = {
        "nom": nom,
        "edat": edat,
        "cicle": cicle,
        "curs": curs,
        "assignatures": assignatures,
        "repetidor": repetidor,
        "tutoria": {"tutor": tutor, "horari": horari}
    }

    col.insert_one(nou_alumne)
    print("alumne afegit")

def actualitzar_nota():
    nom = input("Nom de l'alumne: ")
    assignatura = input("Assignatura a actualitzar: ")
    nova_nota = float(input("Nova nota: "))

    # busca a l'alumne de una asignatura i una nota concretes
    resultat = col.update_one(
        {"nom": nom, "assignatures.nom": assignatura},
        # Amb el set actualitzem el valor de la nota
        {"$set": {"assignatures.$.nota": nova_nota}}
    )

    if resultat.modified_count > 0:
        print("La nota ha sigut actulitzada")
    else:
        print("No s'ha trobat al alumne")

def sortir():
    print("Sortint")
    exit()
    
def menu():
    while True:
        print("\nMenu Principal")
        print("1- Mostrar els estudiants")
        print("2- Mostrar els aprobats")
        print("3- Mostrar nom i nota")
        print("4- Afegir un alumne")
        print("5- Actualitzar la nota d'un alumne")
        print("0- Sortir")
        
        opcio = (input("Escull una opcio: "))

        if opcio == "1":
            mostrar_tots()
        elif opcio == "2":
            mostrar_aprovats()
        elif opcio == "3":
            nom_nota()
        elif opcio == "4":
            afegir_alumne()
        elif opcio == "5":
            actualitzar_nota()
        elif opcio == "0":
            sortir()
            break
        else:
            print("No es valid")
    
menu()    