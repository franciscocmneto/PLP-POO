
class Automovel:
    def __init__(self, cor, peso):
        self.cor = cor
        self.peso = peso

    def get_cor(self):
        return self.cor

    def get_peso(self):
        return self.peso


class Carro(Automovel):

    def __init__(self, cor, peso, numero_portas):
        super().__init__(cor, peso)
        self.numero_portas = numero_portas

    def get_numero_portas(self):
        return self.numero_portas
