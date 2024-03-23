import json
import pandas as pd

with open('labaproga4.txt','r') as json_data:
    df = pd.read_json(json_data)
    df.to_csv("csv4",index=False)
