
main :: IO()
main = do
    putStrLn "Digite sua idade"
    input <- getLine
    let idade = read input :: Int
    if idade >= 18
        then putStrLn "Maior de idade"
        else putStrLn "Menor de idade"