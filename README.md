
# TP_Spring_Injection

Ce projet démontre comment utiliser les profils (@Profile) et les propriétés (app.properties) de Spring pour changer dynamiquement l'implémentation d'une application sans jamais modifier son code source (respect du principe OCP).

Architecture du projet :

<img width="791" height="976" alt="Image" src="https://github.com/user-attachments/assets/0e08550b-b0e5-430d-a934-903bc9082cac" />

Les Profils (@Profile) : Parfait pour basculer facilement entre des environnements entiers (dev, prod, test):
<img width="777" height="345" alt="Image" src="https://github.com/user-attachments/assets/680ff0ae-0ec9-4346-9d05-28dae838cdfc" />

La Priorité (@Primary) : Très pratique pour définir une implémentation par défaut quand il y a plusieurs choix possibles:

<img width="768" height="352" alt="Image" src="https://github.com/user-attachments/assets/1070ada1-7033-491e-b042-6d91b7cb2d2a" />

L'Alias (@Bean) : La solution de secours ultra-puissante pour câbler manuellement des composants quand on ne veut (ou ne peut) pas modifier leur code source:

<img width="859" height="364" alt="Image" src="https://github.com/user-attachments/assets/7822cbde-704c-4573-bae4-97a67459dfdc" />


Les Propriétés (app.properties) : Idéal pour laisser la main à l'administrateur système de changer le comportement sans toucher au code ni recompiler:
<img width="778" height="349" alt="Image" src="https://github.com/user-attachments/assets/4b7a5865-7548-4099-b573-85a179d2131b" />

