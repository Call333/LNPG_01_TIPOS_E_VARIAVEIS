soma :: Float -> Float -> Float
soma x y = x + y

subtracao :: Float -> Float -> Float
subtracao x y = x - y

multiplicacao :: Float -> Float -> Float
multiplicacao x y = x * y

divisao :: Float -> Float -> Float
divisao x y = x / y

main :: IO ()
main = do
    putStrLn "Digite o primeiro número:"
    input1 <- getLine
    putStrLn "Digite o segundo número:"
    input2 <- getLine
    let num1 = read input1 :: Float
        num2 = read input2 :: Float
    putStrLn $ "Soma: " ++ show (soma num1 num2)
    putStrLn $ "Subtração: " ++ show (subtracao num1 num2)
    putStrLn $ "Multiplicação: " ++ show (multiplicacao num1 num2)
    putStrLn $ "Divisão: " ++ show (divisao num1 num2)