mediaPonderada :: Float -> Float -> Float -> Float -> Float -> Float -> Float
mediaPonderada n1 n2 n3 p1 p2 p3 = (n1 * p1 + n2 * p2 + n3 * p3)/ (p1 + p2 + p3)

main :: IO()
main = do
    putStrLn "Digite a 1° Nota: "
    input1 <- getLine
    putStrLn "Digite a 2° Nota: "
    input2 <- getLine
    putStrLn "Digite a 3° Nota: "
    input3 <- getLine

    putStrLn "Digite o 1° Peso: "
    input4 <- getLine
    putStrLn "Digite o 2° Peso: "
    input5 <- getLine
    putStrLn "Digite o 3° Peso: "
    input6 <- getLine

    let nota1 = read input1 :: Float 
        nota2 = read input2 :: Float
        nota3 = read input3 :: Float
        
    let peso1 = read input4 :: Float
        peso2 = read input5 :: Float
        peso3 = read input6 :: Float

    putStrLn $ "Media ponderada das notas: " ++ show (mediaPonderada nota1 nota2 nota3 peso1 peso2 peso3)