import PySimpleGUI as sg

layout = [[sg.Text('Randy BoBandy')]]

window = sg.Window("DND Sheet", layout)

while True:
    event, value = window.read()

    if event == None:
        break
window.close()
